package juegosolimpicos;

import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> disciplinas;
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
		return this.disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Atleta() {
	}
	public Atleta(String nombre, String pais, int edad) {
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
	}

	public Boolean agregarDisciplina(Disciplina disciplina) {
		for (Disciplina disciplinaExistente : disciplinas){
			if (disciplinaExistente.getNombre().equals(disciplina.getNombre())){
				return false;
			}
		}
		this.disciplinas.add(disciplina);
		return true;
	}

	public Boolean eliminarDisciplina(Disciplina disciplina) {
		for (Disciplina disciplinaExistente : disciplinas){
			if (disciplinaExistente.getNombre().equals(disciplina.getNombre())){
				this.disciplinas.remove(disciplina);
				return true;
			}
		}
		return false;
	}

	public void verInfoAtleta() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Pais: " + this.pais);
		System.out.println("Edad: " + this.edad);
		System.out.println("Disciplinas:");
		for (Disciplina disciplina : disciplinas){
			System.out.println(disciplina.getNombre());
		}
	}
}