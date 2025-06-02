
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;

/**
 *
 * @author lucaGomezB
 */
public class Donacion {
    private TipoDonacion tipo;
    private String descripcion;
    private LocalDate fecha;
    private Donante donante;
    public Donacion(TipoDonacion tipo, String descripcion, Donante donante) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
        this.donante = donante;
    }

    public TipoDonacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDonacion tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Donacion { \n\ttipo=" + tipo + "\n\tdescripcion=" + descripcion + "\n\tfecha=" + fecha + "\n } \n";
    }
    
    
}
