package ar.unrn.eje1;

public class LibroRegular extends Libro {
	private String nombre;

	public LibroRegular(String nombre) {
		super(nombre);
	}

	public double calcularDeuda(int diasAlquilados) { 
		double monto = 2;
		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;
		return monto;
	}

}
