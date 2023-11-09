package juegosolimpicos;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Atleta> atletas;
	private Disciplina disciplina;
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Atleta> getAtletas() {
		return this.atletas;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Equipo(String nombre, Disciplina disciplina){
		this.nombre = nombre;
		this.disciplina = disciplina;
	}

	public Boolean agregarAtleta(Atleta atleta) {
		try {
			for (Atleta atletaexistente : atletas){
				if (atletaexistente.getNombre().equals(atleta.getNombre())){
					return false;
				}
			}
			this.atletas.add(atleta);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	public Boolean eliminarAtleta(Atleta atleta) {
		try {
			for (Atleta atletaexistente : atletas){
				if (atletaexistente.getNombre().equals(atleta.getNombre())){
					this.atletas.remove(atleta);
					return true;
				}
			}
			return false;
		} catch (Exception e){
			return false;
		}
	}

	public void verInfoEquipo() {
		System.out.println("Nombre de equipo: " + this.nombre);
		System.out.println("Disciplina: " + this.disciplina.getNombre());
		System.out.println("Atletas:");
		for (Atleta atleta : atletas){
			System.out.println(atleta.getNombre());
		}
	}
}