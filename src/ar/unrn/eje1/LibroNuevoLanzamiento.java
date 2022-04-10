package ar.unrn.eje1;

public class LibroNuevoLanzamiento extends Libro {
	private static double MULTIPLICADOR = 3; // Numeros Magicos
	private String nombre;

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);
	}

	public String nombre() {
		return nombre;
	}

	public double calcularDeuda(int diasAlquilados) {
		return diasAlquilados * MULTIPLICADOR;
	}

	public int calcularPuntosAlquiler(int diasAlquilados) {
		int puntosAlquiler = 1;
		if (diasAlquilados > 1) {
			puntosAlquiler += 1;
		}
		return puntosAlquiler;
	}

}
