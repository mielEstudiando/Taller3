package juegosolimpicos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
	private Disciplina disciplina;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private LocalDate fecha;

	private ArrayList<Atleta> atletas = new ArrayList<Atleta>();

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

	public Evento(Disciplina disciplina, LocalDate fecha){
		this.disciplina = disciplina;
		this.fecha = fecha;
	}

	public Boolean agregarAtleta(Atleta atleta) {
		if (atletas!=null) {
			for (Atleta atletaexistente : atletas) {
				if (atletaexistente.getNombre().equals(atleta.getNombre())) {
					return false;
				}
			}
		}
		this.atletas.add(atleta);
		return true;
	}

	public Boolean eliminarAtleta(Atleta atleta) {
		if (atletas!=null) {
			for (Atleta atletaexistente : atletas) {
				if (atletaexistente.getNombre().equals(atleta.getNombre())) {
					this.atletas.remove(atleta);
					return true;
				}
			}
		}
		return false;
	}

	public Boolean agregarEquipo(Equipo equipo) {
		if (equipos != null) {
			for (Equipo equipoexistente : equipos) {
				if (equipoexistente.getNombre().equals(equipo.getNombre())) {
					return false;
				}
			}
		}
		this.equipos.add(equipo);
		return true;
	}

	public Boolean eliminarEquipo(Equipo equipo) {
		if (equipos!=null) {
			for (Equipo equipoexistente : equipos) {
				if (equipoexistente.getNombre().equals(equipo.getNombre())) {
					this.equipos.remove(equipoexistente);
					return true;
				}
			}
		}
		return false;
	}

	public void verInfoEvento() {
		if ((this.disciplina!=null)&&(this.fecha!=null)) {
			System.out.println("Disciplina: " + this.disciplina.getNombre());
			System.out.println("Fecha: " + this.fecha);
			System.out.println("Equipos: ");
		}
		if (this.equipos!=null) {
			for (Equipo equipo : equipos) {
				if (equipo.getNombre()!=null) {
					System.out.println(equipo.getNombre());
				}
			}
		}
		System.out.println("Atletas: ");
		if (this.atletas!=null) {
			for (Atleta atleta : atletas) {
				if (atleta!=null) {
					System.out.println(atleta.getNombre());
				}
			}
		}
	}
}