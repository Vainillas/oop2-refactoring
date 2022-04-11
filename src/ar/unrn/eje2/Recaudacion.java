package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {
	private static final String nombreArchivo = "data.csv";

	private static final String nombreCompa�ia = "company_name";
	private static final String ciudad = "city";
	private static final String estado = "state";
	private static final String round = "round";
	private static final String permalink = "permalink";
	private static final String numeroEmpleados = "number_employees";
	private static final String categoria = "category";
	private static final String fechaFundacion = "funded_date";
	private static final String cantidadRecaudada = "raised_amount";
	private static final String monedaRecaudada = "raised_currency";

	public static List<String[]> leerArchivo() throws IOException {
		List<String[]> csvData = new ArrayList<String[]>();
		CSVReader reader = new CSVReader(new FileReader(nombreArchivo));
		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();
		// csvData.remove(0);

		return csvData;
	}

//Devuelve la/las filas que cumplan con las condiciones
	public static List<Map<String, String>> where(Map<String, String> options) throws IOException {

		List<String[]> csvData = leerArchivo();

		if (options.containsKey(nombreCompa�ia))
			csvData = obtenerDatosPorLlave(csvData, options, 1);
		if (options.containsKey(ciudad))
			csvData = obtenerDatosPorLlave(csvData, options, 4);

		if (options.containsKey(estado))
			csvData = obtenerDatosPorLlave(csvData, options, 5);

		if (options.containsKey(round))
			csvData = obtenerDatosPorLlave(csvData, options, 9);

		List<Map<String, String>> output = new ArrayList<Map<String, String>>();

		for (int i = 0; i < csvData.size(); i++) {
			Map<String, String> mapped = new HashMap<String, String>();
			mappearListaDeString(mapped, csvData, i);
			output.add(mapped);
		}
		return output;
	}

	public static void mappearListaDeString(Map<String, String> map, List<String[]> csvData, int indice) {
		map.put(permalink, csvData.get(indice)[0]);
		map.put(nombreCompa�ia, csvData.get(indice)[1]);
		map.put(numeroEmpleados, csvData.get(indice)[2]);
		map.put(categoria, csvData.get(indice)[3]);
		map.put(ciudad, csvData.get(indice)[4]);
		map.put(estado, csvData.get(indice)[5]);
		map.put(fechaFundacion, csvData.get(indice)[6]);
		map.put(cantidadRecaudada, csvData.get(indice)[7]);
		map.put(monedaRecaudada, csvData.get(indice)[8]);
		map.put(round, csvData.get(indice)[9]);
	}

	public static List<String[]> obtenerDatosPorLlave(List<String[]> csvData, Map<String, String> options, int indice)
			throws IOException {
		List<String[]> results = new ArrayList<String[]>();
		List<String[]> archivo = leerArchivo();
		String nombreLlave = archivo.get(0)[indice];

		for (int i = 0; i < csvData.size(); i++) {

			String datoArchivo = csvData.get(i)[indice];
			String datoLlave = options.get(nombreLlave);
			if (datoArchivo.equals(datoLlave)) // Identaci�n (�Lo paso a m�todo?)
				results.add(csvData.get(i));
		}
		return results;
	}

//Devuelve la primera fila que cumpla con las condiciones
	public static Map<String, String> findBy(Map<String, String> options) throws IOException, NoSuchEntryException {
		List<String[]> csvData = leerArchivo();
		Map<String, String> mapped = new HashMap<String, String>();

		for (int i = 0; i < csvData.size(); i++) {
			if (options.containsKey(nombreCompa�ia)) {
				if (csvData.get(i)[1].equals(options.get(nombreCompa�ia))) {
					mappearListaDeString(mapped, csvData, i);
				} else {
					continue;
				}
			}

			if (options.containsKey(ciudad)) {
				if (csvData.get(i)[4].equals(options.get(ciudad))) {
					mappearListaDeString(mapped, csvData, i);
				} else {
					continue;
				}
			}

			if (options.containsKey(estado)) {
				if (csvData.get(i)[5].equals(options.get(estado))) {
					mappearListaDeString(mapped, csvData, i);
				} else {
					continue;
				}
			}

			if (options.containsKey(round)) {
				if (csvData.get(i)[9].equals(options.get(round))) {
					mappearListaDeString(mapped, csvData, i);
				} else {
					continue;
				}
			}

			return mapped;
		}

		throw new NoSuchEntryException();
	}

	public static void main(String[] args) {
		try {
			Map<String, String> options = new HashMap<String, String>();
			options.put("company_name", "Facebook");
			options.put("round", "a");
			System.out.print(Recaudacion.where(options).size());
		} catch (IOException e) {
			System.out.print(e.getMessage());
			System.out.print("error");
		}
	}
}

class NoSuchEntryException extends Exception {
}