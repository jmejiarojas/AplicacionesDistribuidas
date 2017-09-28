package pe.cibertec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.cibertec.model.Articulo;

public class ArticuloDAO {
	public ArrayList<Articulo> listarArticuloSinStock() {
		ArrayList<Articulo> articulos = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdws", "root", "Oracle11g");
			PreparedStatement cmd = cn.prepareStatement("select * from articulo where stock = 0");
			ResultSet rs = cmd.executeQuery();
			articulos = new ArrayList<>();
			Articulo bean;
			while (rs.next()) {
				bean = new Articulo();
				bean.setCodigo(rs.getString(1));
				bean.setNombre(rs.getString(2));
				bean.setStock(rs.getInt(3));
				articulos.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articulos;
	}
}
