package ar.unrn.eje3;

import java.util.List;

public class ReporteDeGastos {
	private Gastos listaGastos;
	private ProveedorFecha manejadorFecha;

	public ReporteDeGastos(List<Gasto> gastos, ProveedorFecha fecha) {
		listaGastos = new Gastos(gastos);
		this.manejadorFecha = fecha;
	}

	class Gastos {
		private List<Gasto> gastos;

		Gastos(List<Gasto> gastos) {
			this.gastos = gastos;
		}

		int totalGastos() {
			int total = 0;
			for (Gasto gasto : gastos) {
				total += gasto.monto();
			}
			return total;
		}

		int totalGastosDeComida() {
			int gastosDeComida = 0;
			for (Gasto gasto : gastos) {
				gastosDeComida = gasto.sumaSiSosComida(gastosDeComida);
			}
			return gastosDeComida;
		}

		StringBuffer informacionGastos() {
			StringBuffer infoGastos = new StringBuffer();
			for (Gasto gasto : gastos) {

				String nombreGasto = gasto.nombre();
				String marcaExcesoComidas = gasto.hayExceso() ? "X" : " ";
				String infoTotalGasto = (nombreGasto + "\t" + gasto.monto() + "\t" + marcaExcesoComidas);
				infoGastos.append(infoTotalGasto);
			}
			return infoGastos;
		}
	}

	public int totalGastos() {
		return listaGastos.totalGastos();
	}

	public int totalGastosDeComida() {
		return listaGastos.totalGastosDeComida();
	}

	public StringBuffer informacionReporteDeGastos() {
		StringBuffer infoGastos = new StringBuffer();
		infoGastos.append("Expenses " + manejadorFecha.generarFecha());
		infoGastos.append(listaGastos.informacionGastos());

		infoGastos.append("Gastos de comida: " + totalGastosDeComida());
		infoGastos.append("Total de gastos: " + totalGastos());
		return infoGastos;
	}

}
