
package com.mycompany.recuperatorioprimerparcial;

/**
 *
 * @author lucaGomezB
 */
public class Capacitador extends Persona{
    private String especialidad;
    private Capacitacion capacitacion;
    public Capacitador(String nombre, String dni, String email, Domicilio domicilio, String especialidad) {
        super(nombre, dni, email, domicilio);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Capacitador{\n\tespecialidad=" + especialidad + "\n\tcapacitacion="+ capacitacion.getTema() +"\n}";
    }
    
    
}
