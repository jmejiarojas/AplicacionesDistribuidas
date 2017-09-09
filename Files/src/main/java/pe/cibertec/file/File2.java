
package pe.cibertec.file;

import java.io.File;

public class File2 {

    public static void main(String[] args) {
        File f = new File("D:/");
        
        for (File fx: f.listFiles()){
            mostrarFx(fx);
        }
    }
    
    public static void mostrarFx(File fx){
        
        if(fx.listFiles() == null){
            System.out.println(fx.getAbsolutePath());
        }else{
            for (File f: fx.listFiles()){
            if(f.isDirectory()){
                mostrarFx(f);
            }else{
                System.out.println(f.getAbsolutePath());
            }
        }
        }
        
    }
}
