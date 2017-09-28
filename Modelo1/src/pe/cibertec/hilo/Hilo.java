package pe.cibertec.hilo;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import pe.cibertec.dao.ArticuloDAO;
import pe.cibertec.list.ArticulosController;
import pe.cibertec.model.Articulo;

public class Hilo extends Thread {

	@Override
	public void run() {

		try {
			while (true) {
				generarXML();
				sleep(5000); // 5 segundos
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void generarXML() {

		try {
			ArticuloDAO dao = new ArticuloDAO();
			ArrayList<Articulo> listadoArticulos = dao.listarArticuloSinStock();

			ArticulosController controller = new ArticulosController();
			controller.setLstArticulos(listadoArticulos);

			JAXBContext jc = JAXBContext.newInstance(ArticulosController.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String random = sdf.format(new Date());
			File file = new File("/home/julio/Documentos/Tools/modelo1dsw/archivo" + random + ".xml");

			marshaller.marshal(controller, new FileWriter(file));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
