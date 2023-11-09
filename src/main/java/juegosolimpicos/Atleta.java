package juegosolimpicos;

import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad = 0;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();
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
		if ((edad<120)&&(edad>1)) {
			this.edad = edad;
		}
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Atleta(String nombre, String pais, int edad) {
		this.nombre = nombre;
		this.pais = pais;
		if ((edad>1)&&(edad<120)) this.edad = edad;
	}

	public Boolean agregarDisciplina(Disciplina disciplina) {
		if (this.disciplinas!=null) {
			for (Disciplina disciplinaExistente : disciplinas) {
				if (disciplinaExistente.getNombre().equals(disciplina.getNombre())) {
					return false;
				}
			}
		}
		this.disciplinas.add(disciplina);
		disciplina.setNumeroparticipantes(disciplina.getNumeroparticipantes() + 1);
		return true;
	}

	public Boolean eliminarDisciplina(Disciplina disciplina) {
		try {
			for (Disciplina disciplinaExistente : disciplinas){
				if (disciplinaExistente.getNombre().equals(disciplina.getNombre())){
					this.disciplinas.remove(disciplina);
					return true;
				}
			}
			return false;
		}
		catch (Exception e){
			return false;
		}
	}

	public void verInfoAtleta() {
		if ((this.nombre!=null)&&(this.pais!=null)&&(this.edad>=0)) {
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Pais: " + this.pais);
			System.out.println("Edad: " + this.edad);
		}
		System.out.println("Disciplinas:");
		if (this.disciplinas!=null) {
			for (Disciplina disciplina : disciplinas) {
				System.out.println(disciplina.getNombre());
			}
		}
	}
}