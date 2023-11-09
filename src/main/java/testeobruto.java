import juegosolimpicos.Atleta;
import juegosolimpicos.Disciplina;
import juegosolimpicos.Equipo;
import juegosolimpicos.Evento;

import java.time.LocalDate;

public class testeobruto {
    public static void main(String[] args) {
        Atleta atleta = new Atleta("juan", "Chile", 20);
        Disciplina disciplina = new Disciplina("acariciar gatos", "200 gatos");
        atleta.agregarDisciplina(disciplina);
        Equipo equipo = new Equipo("equipo", disciplina);
        Evento evento = new Evento(disciplina, LocalDate.now());
        evento.agregarEquipo(equipo);
        atleta.verInfoAtleta();
        disciplina.verInfoDisciplina();
        equipo.verInfoEquipo();
        evento.verInfoEvento();
    }
}
