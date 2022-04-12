package ar.unrn.eje3;

public abstract class Gasto {
	private int monto;

	public Gasto(int monto) {
		this.monto = monto;
	}

	public int monto() {
		return this.monto;
	}

	public abstract String nombre();

	public boolean hayExceso() {
		return false;
	}

	public int sumaSiSosComida(int gastosDeComida) {
		return 0;
	}

}
