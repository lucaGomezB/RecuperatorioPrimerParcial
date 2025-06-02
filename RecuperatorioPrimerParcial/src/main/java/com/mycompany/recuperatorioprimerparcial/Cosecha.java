
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;

/**
 *
 * @author lucaGomezB
 */
public class Cosecha {
    private LocalDate fecha;
    private double cantidadKg;

    public Cosecha(double cantidadKg) {
        this.cantidadKg = cantidadKg;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(double cantidadKg) {
        this.cantidadKg = cantidadKg;
    }

    @Override
    public String toString() {
        return "Cosecha{\n\tfecha=" + fecha + "\n\tcantidadKg=" + cantidadKg + "\n}";
    }
    
    
}
