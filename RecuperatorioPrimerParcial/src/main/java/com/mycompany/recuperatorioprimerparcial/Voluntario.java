
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Voluntario extends Persona{
    private Capacitacion capacitacion;
    private Turno turno;
    private ArrayList<Tarea> tareasRealizadas = new ArrayList<>();
    public Voluntario(String nombre, String dni, String email, Domicilio domicilio, String horario) {
        super(nombre, dni, email, domicilio);
        this.turno = new Turno(horario, this);
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public void realizarTarea(Tarea tarea){
        this.tareasRealizadas.add(tarea);
    }

    @Override
    public String toString() {
        return super.toString()+"Voluntario {\n\tturno = " + turno + "tareasRealizadas = " + tareasRealizadas + "\n}\n";
    }
    
    
}
