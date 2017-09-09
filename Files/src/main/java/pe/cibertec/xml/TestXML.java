package pe.cibertec.xml;

import java.io.File;
import java.io.FileWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import pe.cibertec.beans.Trabajador;

public class TestXML {

    public static void main(String[] args) {
        try {
            
            Trabajador trabajador = new Trabajador();
            trabajador.setDni("11111111");
            trabajador.setNombre("Julio");
            trabajador.setSueldo(100.50);
            
            JAXBContext jc = JAXBContext.newInstance(Trabajador.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //marshaller.marshal(trabajador, System.out);
            
            File f = new File("D:/trabajador.xml");
            marshaller.marshal(trabajador, new FileWriter(f));
            System.out.println("Archivo creado");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
