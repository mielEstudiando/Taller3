package juegosolimpicos;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Atleta> atletas;
	private Disciplina disciplina;
	public ArrayList<Evento> evento = new ArrayList<Evento>();
	public Atleta unnamed_Atleta_;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atleta> getAtletas() {
		throw new UnsupportedOperationException();
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		throw new UnsupportedOperationException();
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Equipo() {
		throw new UnsupportedOperationException();
	}

	public void agregarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarAtleta(Atleta atleta) {
		throw new UnsupportedOperationException();
	}

	public void verInfoEquipo() {
		throw new UnsupportedOperationException();
	}
}