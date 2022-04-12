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

		// Inicialización
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

		// Ejercitación
		int totalGastosComida = reporte.totalGastosDeComida();

		// Verificación
		assertEquals(11710, totalGastosComida);
	}

	@Test
	public void TestReporteDeGastosTotal() {

		// Inicialización
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

		// Ejercitación
		int totalGastos = reporte.totalGastos();

		// Verificación
		assertEquals(26710, totalGastos);
	}

	@Test
	public void TestInformaciónReporteDeGastos() {
		// Inicialización
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

		// Ejercitación
		List<String> listaInfo = reporte.informacionReporteDeGastos();

		// Verificación | ¿Como hacer el test con String/StringBuffer?
		assertEquals(7, listaInfo.size()); // 3 Strings fijos + X Strings (1 por gasto)
	}

}
