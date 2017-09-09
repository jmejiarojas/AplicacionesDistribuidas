
package pe.cibertec.xml;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import pe.cibertec.beans.Trabajador;
import pe.cibertec.beans.Trabajadores;

public class TestXML2 {

    public static void main(String[] args) {
        try {
            ArrayList<Trabajador> lista = new ArrayList<>();
            Trabajador trab;
            
            for(int i = 1; i<=5; i++){
                trab = new Trabajador();
                trab.setDni("111111");
                trab.setNombre("xxxx"+i);
                trab.setSueldo(i*100);
                lista.add(trab);
            }
            
            
            Trabajadores bean = new Trabajadores();
            bean.setTrabajadores(lista);
            
            JAXBContext jc = JAXBContext.newInstance(Trabajadores.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            
            File f = new File("/home/julio/Documentos/Tools/trabajadores.xml");
            marshaller.marshal(bean, new FileWriter(f));
            
        } catch (Exception ex) {
            Logger.getLogger(TestXML2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
