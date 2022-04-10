package ar.unrn.eje1;

public class Main {

	public static void main(String args[]) {
		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");
		Cliente yo = new Cliente("Javier");

		yo.alquilar(elTunel, 5);
		yo.alquilar(antesDelFin, 3);
		System.out.println(yo.montoDeuda());
		System.out.println(yo.puntosObtenidos());
	}
}