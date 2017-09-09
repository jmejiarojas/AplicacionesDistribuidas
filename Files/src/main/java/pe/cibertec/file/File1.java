/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.cibertec.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SUITE
 */
public class File1 {
    public static void main(String[] args) {
        
         File f = new File("D:/lista.txt");
         System.out.println("Tamaño: " + f.length());
         
         long val = f.lastModified();
         Date date=new Date(val);
        SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");
         String dateText = df2.format(date);
         
         System.out.println("Ultima modificacion: " + dateText);
         System.out.println("Ruta: " + f.getAbsolutePath());
         System.out.println("Nombre: " + f.getName());
         System.out.println("Escritura? : " + f.canWrite());
         System.out.println("Lectura? : " + f.canRead());
         System.out.println("Es archivo ? : " + f.exists());
         System.out.println("Es directorio? : " + f.isDirectory());
         System.out.println("Es oculto? : " + f.isHidden());
         System.out.println("Lista de files? : " + f.listFiles());
    }
}
