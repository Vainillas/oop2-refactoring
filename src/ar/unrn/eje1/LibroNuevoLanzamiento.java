package ar.unrn.eje1;

public class LibroNuevoLanzamiento extends Libro {
	private String nombre;

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);
	}

	public String nombre() {
		return nombre;
	}

	public double calcularDeuda(int diasAlquilados) {
		return diasAlquilados * 3;
	}

	public int calcularPuntosAlquiler(int diasAlquilados) {
		int puntosAlquiler = 1;
		if (diasAlquilados > 1) {
			puntosAlquiler += 1;
		}
		return puntosAlquiler;
	}

}
