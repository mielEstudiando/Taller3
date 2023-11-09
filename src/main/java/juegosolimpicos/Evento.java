package juegosolimpicos;

import java.time.LocalDate;

public class Evento {
	private Disciplina disciplina;
	private Equipo equipo;
	private LocalDate fecha;

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Evento() {
		throw new UnsupportedOperationException();
	}

	public void agregarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void verInfoEvento() {
		throw new UnsupportedOperationException();
	}
}