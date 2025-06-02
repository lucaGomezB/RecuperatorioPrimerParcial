
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Capacitacion {
    private String tema;
    private LocalDate fecha;
    private ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private Capacitador capacitador;

    public Capacitacion(String tema, Capacitador capacitador) {
        this.tema = tema;
        this.fecha = LocalDate.now();
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }
    
    public void addVoluntario(Voluntario voluntario){
        this.voluntarios.add(voluntario);
        voluntario.setCapacitacion(this);
    }
    
    public void mostrarAsistentes(){
        for(Voluntario voluntario : voluntarios){
            voluntario.mostrarDatosResumidos();
        }
        capacitador.mostrarDatosResumidos();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
    
    

    @Override
    public String toString() {
        return "Capacitacion {\n\ttema = " + tema + "\n\tfecha = " + fecha + "\n\tvoluntarios = " + voluntarios + "\n}\n";
    }
    
    
}
