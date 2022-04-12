package ar.unrn.eje3;

public class GastoAlquilerAuto extends Gasto {
	private static final String nombre = "Alquiler de autos";

	public GastoAlquilerAuto(int monto) {
		super(monto);
	}

	@Override
	public String nombre() {
		return nombre;
	}

}
