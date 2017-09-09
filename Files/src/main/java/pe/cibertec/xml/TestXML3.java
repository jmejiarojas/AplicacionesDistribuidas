package pe.cibertec.xml;

import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import pe.cibertec.beans.Trabajadores;

public class TestXML3 {

	public static void main(String[] args) {
		try {
			JAXBContext contexto = JAXBContext.newInstance(Trabajadores.class);
			Unmarshaller unmarshaller = contexto.createUnmarshaller();

			// Tienes que poner una ruta valida
			Trabajadores obj = (Trabajadores) unmarshaller
					.unmarshal(new FileReader("/home/julio/Documentos/Tools/trabajadores.xml"));

			obj.getTrabajadores().forEach(System.out::println);

		} catch (Exception ex) {
			Logger.getLogger(TestXML3.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
