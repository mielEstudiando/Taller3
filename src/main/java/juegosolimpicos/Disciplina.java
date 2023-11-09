package juegosolimpicos;

import java.util.ArrayList;

public class Disciplina {
	private String nombre;
	private int numeroparticipantes = 0;
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
		if (numeroparticipantes>=0) this.numeroparticipantes = numeroparticipantes;
	}

	public String getRecordmundial() {
		return this.recordmundial;
	}

	public void setRecordmundial(String recordmundial) {
		this.recordmundial = recordmundial;
	}

	public Disciplina(String nombre, String recordmundial) {
		this.nombre = nombre;
		this.recordmundial = recordmundial;
	}

	public void verInfoDisciplina() {
		if ((this.nombre!=null)&&(this.recordmundial!=null)) {
			System.out.println("Nombre de disciplina: " + this.nombre);
			System.out.println("Número de participantes: " + this.numeroparticipantes);
			System.out.println("Record mundial: " + this.recordmundial);
		}
	}
}