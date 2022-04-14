package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvData implements Datos {

	public List<String[]> leer() throws IOException {
		List<String[]> csvData = new ArrayList<String[]>();
		CSVReader reader = new CSVReader(new FileReader("data.csv"));
		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();

		return csvData;

	}

}