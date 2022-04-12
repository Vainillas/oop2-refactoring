package ar.unrn.eje3;

public abstract class Gasto {
	private int monto;

	public Gasto(int monto) { // Cambiar el int (preguntar con que o como puedo modelar el precio)
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
		return gastosDeComida;
	}

}
