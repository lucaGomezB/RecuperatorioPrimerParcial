
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;

/**
 *
 * @author lucaGomezB
 */
public class Turno {
    private LocalDate fecha;
    private String horario;
    private Voluntario voluntario;
    public Turno(String horario, Voluntario voluntario) {
        this.fecha = LocalDate.now();
        this.voluntario = voluntario;
        this.horario = horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    @Override
    public String toString() {
        return "Turno{\n\tfecha=" + fecha + "\n\thorario=" + horario + "\n}";
    }
    
    
}
