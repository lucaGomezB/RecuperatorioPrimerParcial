
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Cultivo {
    private String especie;
    private TipoCultivo tipo;
    private LocalDate fechaSiembra;
    private Sector sector;
    private ArrayList<Cosecha> cosechas = new ArrayList<>();
    public Cultivo(String especie, TipoCultivo tipo, LocalDate fechaSiembra, Sector sector) {
        this.especie = especie;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
        this.sector = sector;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
    
    public ArrayList<Cosecha> getCosechas(){
        return cosechas;
    }
    
    public void generarCosecha(double cantidadKg){
        this.cosechas.add(new Cosecha(cantidadKg));
    }

    @Override
    public String toString() {
        return "Cultivo { \n\tespecie = " + especie + "\n\ttipo = " + tipo + "\n\tfechaSiembra = " + fechaSiembra + "\n\tsector = " + sector + "\n}\n";
    }
    
    
}
