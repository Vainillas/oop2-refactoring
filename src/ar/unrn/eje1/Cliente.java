package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente { // Regla 7
	private Alquileres alquileres;
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
		this.alquileres = new Alquileres(); // Regla 4
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

		int puntosAlquileres() {
			int puntos = 0;
			for (Alquiler a : this.alquileres()) {
				puntos += a.calcularPuntosAlquiler();
			}
			return puntos;
		}
	}

	public double montoDeuda() { // Separo los metodos
		double total = 0;
		for (Alquiler a : alquileres.alquileres()) {
			total += a.totalDeuda();
		}
		return total;

	}

	public int puntosObtenidos() { // Separo metodos
		int puntos = alquileres.puntosAlquileres();
		return puntos;
	}

	public void alquilar(Libro l, int diasAlquilados) { // Tell don't ask
		Alquiler alquiler = new Alquiler(l, diasAlquilados);
		this.alquileres.añadir(alquiler);
	}

	public String nombre() {
		return this.name;
	}
}