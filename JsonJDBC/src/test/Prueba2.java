package test;

import bean.ArticulosBean;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileInputStream;

public class Prueba2 {
    
    public static void main(String[] args) {
        
        
        try {
            
            String data="";
            File f = new File("/home/julio/Documentos/Tools/articulos.json");
            FileInputStream entrada = new FileInputStream(f);
             
            int b;
            
            while((b = entrada.read()) != -1){
                data = data + (char)b;
            }
             
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(data);

            Gson json = new Gson();
            ArticulosBean[] articulos = json.fromJson(element, ArticulosBean[].class);

            for(ArticulosBean bean:articulos){
                System.out.println("Cod " + bean.getCod() + ", nom " + bean.getNom() + ", stock " + bean.getStock());   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }
}
