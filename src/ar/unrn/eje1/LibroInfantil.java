package ar.unrn.eje1;

public class LibroInfantil extends Libro {
	private static double MULTIPLICADOR = 1.5; // Numeros Magicos
	private static double PRECIO = 1.5;
	private static int DIASAUMENTODEUDA = 3;
	private String nombre;

	public LibroInfantil(String nombre) {
		super(nombre);
	}

	public String nombre() {
		return this.nombre;
	}

	public double calcularDeuda(int diasAlquilados) {
		double monto = PRECIO;
		if (diasAlquilados > DIASAUMENTODEUDA)
			monto += (diasAlquilados - DIASAUMENTODEUDA) * MULTIPLICADOR;
		return monto;
	}

}
