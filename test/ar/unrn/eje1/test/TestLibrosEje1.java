package ar.unrn.eje1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ar.unrn.eje1.Cliente;
import ar.unrn.eje1.Libro;
import ar.unrn.eje1.LibroInfantil;
import ar.unrn.eje1.LibroNuevoLanzamiento;
import ar.unrn.eje1.LibroRegular;

public class TestLibrosEje1 {
	@Test
	public void LibroInfantilTestDeuda() {
		// Inicialización
		Libro cuentosDeLaSelva = new LibroInfantil("Cuentos de la selva");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(cuentosDeLaSelva, 7);
		double deuda = 1.5 + (7 - 3) * 1.5;

		// Verificación
		assertEquals(deuda, yo.montoDeuda());

	}

	@Test
	public void LibroInfantilTestAlquiler() {

		// Inicialización
		Libro cuentosDeLaSelva = new LibroInfantil("Cuentos de la selva");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(cuentosDeLaSelva, 7);
		int puntajeAlquiler = 1;

		// Verificación
		assertEquals(puntajeAlquiler, yo.puntosObtenidos());

	}

	@Test
	public void LibroRegularTestDeuda() {
		// Inicialización
		Libro elResplandor = new LibroRegular("El Resplandor");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(elResplandor, 7);
		double deuda = 2 + (7 - 2) * 1.5;

		// Verificación
		assertEquals(deuda, yo.montoDeuda());

	}

	@Test
	public void LibroRegularTestAlquiler() {
		// Inicialización
		Libro elResplandor = new LibroRegular("El Resplandor");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(elResplandor, 7);
		int puntosAlquiler = 1;

		// Verificación
		assertEquals(puntosAlquiler, yo.puntosObtenidos());

	}

	@Test
	public void LibroNuevoLanzamientoTestDeuda() {
		// Inicialización
		Libro elArteDeLaGuerra = new LibroNuevoLanzamiento("El arte de la guerra");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(elArteDeLaGuerra, 7);
		double deuda = 7 * 3;

		// Verificación
		assertEquals(deuda, yo.montoDeuda());

	}

	@Test
	public void LibroNuevoLanzamientoTestAlquiler() {
		// Inicialización
		Libro elArteDeLaGuerra = new LibroNuevoLanzamiento("El arte de la guerra");
		Cliente yo = new Cliente("Mateo");
		// Ejercitación
		yo.alquilar(elArteDeLaGuerra, 7);
		int puntosAlquiler = 2;

		// Verificación
		assertEquals(puntosAlquiler, yo.puntosObtenidos());

	}
}
