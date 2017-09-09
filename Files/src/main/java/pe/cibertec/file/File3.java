
package pe.cibertec.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File3 {

    public static void main(String[] args) {
        
        File origenFile = new File("D:/lista.txt");
        File destinoFile = new File("D:/nuevaLista.txt");
        
        try {
            FileInputStream input = new FileInputStream(origenFile);
            FileOutputStream output = new FileOutputStream(destinoFile);
            
            //Recorremos los files del origen para escribirlos en output
            int byteOrigen;
            while( (byteOrigen = input.read()) != -1 ){
                output.write(byteOrigen);
            }
            
            input.close();
            output.close();
            
            System.out.println("Archivo Creado");
            
        } catch (Exception ex) {
            Logger.getLogger(File3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
