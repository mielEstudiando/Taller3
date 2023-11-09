package juegosolimpicos;

import java.util.ArrayList;

public class Disciplina {
	private String nombre;
	private int numeroparticipantes;
	private String recordmundial;
	public ArrayList<Atleta> atleta = new ArrayList<Atleta>();
	public Evento evento;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroparticipantes() {
		return this.numeroparticipantes;
	}

	public void setNumeroparticipantes(int numeroparticipantes) {
		this.numeroparticipantes = numeroparticipantes;
	}

	public String getRecordmundial() {
		return this.recordmundial;
	}

	public void setRecordmundial(String recordmundial) {
		this.recordmundial = recordmundial;
	}

	public Disciplina() {
		throw new UnsupportedOperationException();
	}

	public void verInfoDisciplina() {
		throw new UnsupportedOperationException();
	}
}