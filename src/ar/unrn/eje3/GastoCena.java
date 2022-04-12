package ar.unrn.eje3;

public class GastoCena extends Gasto {
	private static final String nombre = "Cena";

	public GastoCena(int monto) {
		super(monto);
	}

	public String nombre() {
		return nombre;
	}

	public boolean hayExceso() {
		return this.monto() > 5000;
	}

	public int sumaSiSosComida(int gastosDeComida) {
		return gastosDeComida + this.monto();
	}

}
