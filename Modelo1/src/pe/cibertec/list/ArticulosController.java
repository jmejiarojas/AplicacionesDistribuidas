package pe.cibertec.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import pe.cibertec.model.Articulo;

@XmlRootElement
public class ArticulosController {

	private List<Articulo> lstArticulos = new ArrayList<>();

	public List<Articulo> getLstArticulos() {
		return lstArticulos;
	}

	public void setLstArticulos(List<Articulo> lstArticulos) {
		this.lstArticulos = lstArticulos;
	}
}
