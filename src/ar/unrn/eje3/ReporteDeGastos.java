package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteDeGastos {
	private List<Gasto> gastos;

	public ReporteDeGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}

	public int totalGastos() {
		int total = 0;
		for (Gasto gasto : gastos) {
			total += gasto.monto();
		}
		return total;
	}

	public int totalGastosDeComida() {
		int gastosDeComida = 0;
		for (Gasto gasto : gastos) {
			gastosDeComida = gasto.sumaSiSosComida(gastosDeComida);
		}
		return gastosDeComida;
	}

	public List<String> informacionReporteDeGastos() {
		List<String> listaInfoGastos = new ArrayList<String>();
		listaInfoGastos.add("Expenses " + LocalDate.now()); // Sacar LocalDate inyectar otro gestor de fecha

		for (Gasto gasto : gastos) {

			String nombreGasto = gasto.nombre();
			String marcaExcesoComidas = gasto.hayExceso() ? "X" : " ";
			String infoTotalGasto = (nombreGasto + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
			listaInfoGastos.add(infoTotalGasto);

		}
		listaInfoGastos.add("Gastos de comida: " + totalGastosDeComida());
		listaInfoGastos.add("Total de gastos: " + totalGastos());
		return listaInfoGastos;
	}
}
