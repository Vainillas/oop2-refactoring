package ar.unrn.eje3;

import java.time.LocalDate;

public class DateManager implements ProveedorFecha {
	private LocalDate fecha;

	public DateManager() {
		fecha = LocalDate.of(2022, 3, 27);
	}

	public LocalDate generarFecha() {
		return fecha;
	}

}
