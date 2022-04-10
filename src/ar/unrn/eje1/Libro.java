package ar.unrn.eje1;

public abstract class Libro {
	private String nombre;

	public Libro(String nombre) {
		this.nombre = nombre;
	}

	public String nombre() {
		return nombre;
	}

	public abstract double calcularDeuda(int diasAlquilados);

	public int calcularPuntosAlquiler(int diasAlquilados) {
		return 1;
	}

}