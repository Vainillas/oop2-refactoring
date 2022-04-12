package ar.unrn.eje3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.unrn.eje3.Gasto;
import ar.unrn.eje3.GastoAlquilerAuto;
import ar.unrn.eje3.GastoCena;
import ar.unrn.eje3.GastoDesayuno;
import ar.unrn.eje3.ReporteDeGastos;

public class ReporteDeGastosTest {
	@Test
	public void TestReporteDeGastosComida() {

		// Inicializaci�n
		List<Gasto> listaGastos = new ArrayList<Gasto>();
		Gasto gastoCena1 = new GastoCena(7000);
		Gasto gastoCena2 = new GastoCena(4000);
		Gasto gastoDesayuno1 = new GastoDesayuno(710);
		Gasto gastoAlquilerAuto = new GastoAlquilerAuto(15000);

		listaGastos.add(gastoDesayuno1);
		listaGastos.add(gastoCena1);
		listaGastos.add(gastoCena2);
		listaGastos.add(gastoAlquilerAuto);

		ReporteDeGastos reporte = new ReporteDeGastos(listaGastos);

		// Ejercitaci�n
		int totalGastosComida = reporte.totalGastosDeComida();

		// Verificaci�n
		assertEquals(11710, totalGastosComida);
	}

	@Test
	public void TestReporteDeGastosTotal() {

		// Inicializaci�n
		List<Gasto> listaGastos = new ArrayList<Gasto>();
		Gasto gastoCena1 = new GastoCena(7000);
		Gasto gastoCena2 = new GastoCena(4000);
		Gasto gastoDesayuno1 = new GastoDesayuno(710);
		Gasto gastoAlquilerAuto = new GastoAlquilerAuto(15000);

		listaGastos.add(gastoDesayuno1);
		listaGastos.add(gastoCena1);
		listaGastos.add(gastoCena2);
		listaGastos.add(gastoAlquilerAuto);

		ReporteDeGastos reporte = new ReporteDeGastos(listaGastos);

		// Ejercitaci�n
		int totalGastos = reporte.totalGastos();

		// Verificaci�n
		assertEquals(26710, totalGastos);
	}

	@Test
	public void TestInformaci�nReporteDeGastos() {
		// Inicializaci�n
		List<Gasto> listaGastos = new ArrayList<Gasto>();
		Gasto gastoCena1 = new GastoCena(7000);
		Gasto gastoCena2 = new GastoCena(4000);
		Gasto gastoDesayuno1 = new GastoDesayuno(710);
		Gasto gastoAlquilerAuto = new GastoAlquilerAuto(15000);

		listaGastos.add(gastoDesayuno1);
		listaGastos.add(gastoCena1);
		listaGastos.add(gastoCena2);
		listaGastos.add(gastoAlquilerAuto);

		ReporteDeGastos reporte = new ReporteDeGastos(listaGastos);

		// Ejercitaci�n
		List<String> listaInfo = reporte.informacionReporteDeGastos();

		// Verificaci�n | �Como hacer el test con String/StringBuffer?
		assertEquals(7, listaInfo.size()); // 3 Strings fijos + X Strings (1 por gasto)
	}

}
