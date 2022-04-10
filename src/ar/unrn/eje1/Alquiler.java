package ar.unrn.eje1;

public class Alquiler {
	private Libro libro; // Elimin� el objeto copia (Objeto Anemico)
	private int diasAlquilados;

	public Alquiler(Libro libro, int diasAlquilados) {
		this.libro = libro;
		this.diasAlquilados = diasAlquilados;
	}

	public double totalDeuda() { // Regla 5
		return libro.calcularDeuda(diasAlquilados);
	}

	public int calcularPuntosAlquiler() { // Regla 5
		return libro.calcularPuntosAlquiler(diasAlquilados);
	}
}
