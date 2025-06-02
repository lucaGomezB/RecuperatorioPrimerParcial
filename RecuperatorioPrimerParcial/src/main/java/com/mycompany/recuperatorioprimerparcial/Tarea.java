
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Tarea {
    private String descripcion;
    private LocalDate fecha;
    private ArrayList voluntarios = new ArrayList<>();
    private Sector sector;
    public Tarea(String descripcion, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.sector = sector;
    }
    public Tarea(String descripcion){
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public void addVoluntario(Voluntario v){
        this.voluntarios.add(v);
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Tarea {\n\tdescripcion = " + descripcion + "\n\tfecha = " + fecha + "\n}\n";
    }
    
    
}
