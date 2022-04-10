package ar.unrn.eje1;

public class Alquiler {
	private Libro libro;
	private int diasAlquilados;

	public Alquiler(Libro libro, int diasAlquilados) {
		this.libro = libro;
		this.diasAlquilados = diasAlquilados;
	}

	public double totalDeuda() {
		return libro.calcularDeuda(diasAlquilados);
	}

	public int calcularPuntosAlquiler() {
		return libro.calcularPuntosAlquiler(diasAlquilados);
	}

	public Libro libro() {
		return this.libro;
	}
}
