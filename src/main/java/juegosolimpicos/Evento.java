package juegosolimpicos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private Disciplina disciplina;
	private ArrayList<Equipo> equipos;
	private LocalDate fecha;

	private ArrayList<Atleta> atletas;

	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Equipo> getEquipos() {
		return this.equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}

	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}

	public Evento(Disciplina disciplina, ArrayList<Equipo> equipos, LocalDate fecha){
		this.disciplina = disciplina;
		this.fecha = fecha;
		this.equipos = equipos;
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
		}
		catch (Exception e) {
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

	public Boolean agregarEquipo(Equipo equipo) {
		for (Equipo equipoexistente : equipos){
			if (equipoexistente.getNombre().equals(equipo.getNombre())){
				return false;
			}
		}
		this.equipos.add(equipo);
		return true;
	}

	public Boolean eliminarEquipo(Equipo equipo) {
		for (Equipo equipoexistente : equipos){
			if (equipoexistente.getNombre().equals(equipo.getNombre())){
				this.equipos.remove(equipoexistente);
				return true;
			}
		}
		return false;
	}

	public void verInfoEvento() {
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Equipos: ");
		for (Equipo equipo : equipos){
			System.out.println(equipo.getNombre());
		}
		System.out.println("Atletas: ");
		for (Atleta atleta : atletas){
			System.out.println(atleta.getNombre());
		}
	}
}