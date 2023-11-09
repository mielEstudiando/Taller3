package juegosolimpicos;

import java.util.ArrayList;

public class Disciplina {
	private String nombre;
	private int numeroparticipantes;
	private String recordmundial;

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

	public Disciplina(String nombre, String recordmundial, int numeroparticipantes) {
		this.nombre = nombre;
		this.numeroparticipantes = numeroparticipantes;
		this.recordmundial = recordmundial;
	}

	public void verInfoDisciplina() {
		System.out.println("Nombre de disciplina: " + this.nombre);
		System.out.println("Número de participantes: " + this.numeroparticipantes);
		System.out.println("Record mundial: " + this.recordmundial);
	}
}