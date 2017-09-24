package dao;

import bean.ArticulosBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ArticuloDAO {
    public ArrayList<ArticulosBean> ListaArticulo(){
        ArrayList<ArticulosBean> articulos = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdws","root","Oracle11g");
            PreparedStatement cmd = cn.prepareStatement("select * from articulo");
            ResultSet rs = cmd.executeQuery();
            articulos = new ArrayList<>();
            ArticulosBean bean;
            while(rs.next()){
                bean = new ArticulosBean();
                bean.setCod(rs.getString("cod"));
                bean.setNom(rs.getString("nom"));
                bean.setStock(rs.getInt("stock"));
                articulos.add(bean);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articulos;       
    }
}
