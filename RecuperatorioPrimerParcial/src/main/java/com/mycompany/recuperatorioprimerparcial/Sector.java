
package com.mycompany.recuperatorioprimerparcial;

import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Sector {
    private Tarea tarea;
    private String nombre;
    private String descripcion;
    private ArrayList<Cultivo> cultivos = new ArrayList<>();
    public Sector(Tarea tarea, String nombre, String descripcion) {
        this.tarea = tarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void addCultivo(Cultivo cultivo){
        this.cultivos.add(cultivo);
    }
    
    public ArrayList<Cosecha> getCosechasDelSector(){
        ArrayList<Cosecha> cosechasDelSector = new ArrayList<>();
        for(Cultivo cultivo : this.cultivos){
            for(Cosecha cosecha : cultivo.getCosechas()){
                cosechasDelSector.add(cosecha);
            }
        }
        return cosechasDelSector;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCultivos(ArrayList<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    @Override
    public String toString() {
        return "Sector { \n\ttarea = " + tarea + "\n\tnombre = " + nombre + "\n\tdescripcion = " + descripcion + "\n}\n";
    }
    
    
}
