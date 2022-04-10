package ar.unrn.eje1;

public class LibroRegular extends Libro {
	private static double MULTIPLICADOR = 1.5; // Numeros Magicos
	private static double PRECIO = 2;
	private static int DIASAUMENTODEUDA = 2;
	private String nombre;

	public LibroRegular(String nombre) {
		super(nombre);
	}

	public double calcularDeuda(int diasAlquilados) {
		double monto = PRECIO;
		if (diasAlquilados > DIASAUMENTODEUDA)
			monto += (diasAlquilados - DIASAUMENTODEUDA) * MULTIPLICADOR;
		return monto;
	}

}
