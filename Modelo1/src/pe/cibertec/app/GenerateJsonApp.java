package pe.cibertec.app;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

import pe.cibertec.list.ArticulosController;
import pe.cibertec.model.Articulo;

public class GenerateJsonApp {

	public static void main(String[] args) {

		String path = "/home/julio/Documentos/Tools/modelo1dsw";
		File file = new File(path);

		for (File fx : file.listFiles()) {

			if (getFileExtension(fx).equals("xml")) {
				leerFx(fx);
			}

		}
	}

	private static String getFileExtension(File file) {
		String name = file.getName();
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		} catch (Exception e) {
			return "";
		}
	}

	private static void leerFx(File fx) {
		try {
			JAXBContext contexto = JAXBContext.newInstance(ArticulosController.class);
			Unmarshaller unmarshaller = contexto.createUnmarshaller();

			ArticulosController articulosController = (ArticulosController) unmarshaller.unmarshal(fx);

			List<Articulo> arrayJson = new ArrayList<>();

			// for (Articulo arti : articulosController.getLstArticulos()) {
			// if(!buscar(arti.getCodigo())) {
			// arrayJson.add(arti);
			// }
			//
			// if(arti.get)
			// }

			arrayJson = articulosController.getLstArticulos().stream().distinct().collect(Collectors.toList());

			Gson gson = new Gson();
			String myJson = gson.toJson(arrayJson);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String random = sdf.format(new Date());

			String path = "/home/julio/Documentos/Tools/modelo1dsw/articulos-" + random + ".json";
			File file = new File(path);
			FileOutputStream salida = new FileOutputStream(file);
			salida.write(myJson.getBytes());

			salida.close();
			System.out.println("Json generado");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
