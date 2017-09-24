package test;

import bean.ArticulosBean;
import com.google.gson.Gson;
import dao.ArticuloDAO;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;

public class Prueba1 {
    public static void main(String[] args){
        try {
            ArticuloDAO dao = new ArticuloDAO();
            ArrayList<ArticulosBean> articulos = dao.ListaArticulo();
            
            Gson json = new Gson();
            String data = json.toJson(articulos);
            
            //System.out.println(data);
            File f = new File("/home/julio/Documentos/Tools/articulos.json");
            FileOutputStream salida = new FileOutputStream(f);
            salida.write(data.getBytes());
            
            salida.close();            
            System.out.println("Json generado");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
