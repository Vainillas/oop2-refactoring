package ar.unrn.eje2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Prueba {

	public static void main(String[] args) throws IOException {

		Map<String, String> options = new HashMap<String, String>();
		options.put("company_name", "Facebook");
		Recaudacion.where(options);

	}

}
