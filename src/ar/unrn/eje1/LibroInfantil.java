package ar.unrn.eje1;

public class LibroInfantil extends Libro {
	private String nombre;

	public LibroInfantil(String nombre) {
		super(nombre);
	}

	public String nombre() {
		return this.nombre;
	}

	public double calcularDeuda(int diasAlquilados) {
		double monto = 1.5;
		if (diasAlquilados > 3)
			monto += (diasAlquilados - 3) * 1.5;
		return monto;
	}

}
