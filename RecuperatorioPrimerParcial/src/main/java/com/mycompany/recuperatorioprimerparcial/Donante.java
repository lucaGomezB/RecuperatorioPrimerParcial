
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author lucaGomezB
 */
public class Donante extends Persona{
    private ArrayList<Donacion> donaciones = new ArrayList<>();
    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }
    
    public void mostrarDonaciones(){
        System.out.println(donaciones);
    }
    
    public void donar(TipoDonacion tipo, String descripcion){
        this.donaciones.add(new Donacion(tipo, descripcion, this));
    }

    @Override
    public String toString() {
        return super.toString()+"Donante {\n\t" + "\n\tdonaciones = " + donaciones + "\n}\n";
    }
    
    
}
