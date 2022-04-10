package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Alquileres alquileres;
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
		this.alquileres = new Alquileres();
	}

	class Alquileres {
		private List<Alquiler> alquileres;

		Alquileres() {
			alquileres = new ArrayList<Alquiler>();
		}

		void añadir(Alquiler e) {
			alquileres.add(e);
		}

		List<Alquiler> alquileres() {
			return this.alquileres;
		}
	}

	public double montoDeuda() {
		double total = 0;
		for (Alquiler a : alquileres.alquileres()) {
			total += a.totalDeuda();
		}
		return total;

	}

	public int puntosObtenidos() {
		int puntos = 0;
		for (Alquiler a : alquileres.alquileres()) {
			puntos += a.calcularPuntosAlquiler();
		}
		return puntos;
	}

	public void alquilar(Libro l, int diasAlquilados) {
		Alquiler alquiler = new Alquiler(l, diasAlquilados);
		this.alquileres.añadir(alquiler);
	}

	public String nombre() {
		return this.name;
	}
}