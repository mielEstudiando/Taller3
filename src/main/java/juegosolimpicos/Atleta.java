package juegosolimpicos;

import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Equipo> disciplinas;
	public Equipo unnamed_Equipo_;
	public Evento evento;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		throw new UnsupportedOperationException();
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		throw new UnsupportedOperationException();
	}

	public Atleta() {
		throw new UnsupportedOperationException();
	}

	public void agregarDisciplina(Disciplina disciplina) {
		throw new UnsupportedOperationException();
	}

	public void eliminarDisciplina(Disciplina disciplina) {
		throw new UnsupportedOperationException();
	}

	public void verInfoAtleta() {
		throw new UnsupportedOperationException();
	}
}