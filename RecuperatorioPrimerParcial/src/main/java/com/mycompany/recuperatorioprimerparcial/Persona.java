
package com.mycompany.recuperatorioprimerparcial;

/**
 *
 * @author lucaGomezB
 */
public abstract class Persona {
    private String nombre;
    private String dni;
    private String email;
    private Domicilio domicilio;

    public Persona(String nombre, String dni, String email, Domicilio domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void mostrarDatosResumidos(){
        System.out.println("DNI: "+this.dni+" | NOMBRE: "+this.nombre);
    }

    @Override
    public String toString() {
        return "Persona { \n\tnombre = " + nombre + "\n\tdni = " + dni + "\n\temail = " + email + "\n}\n";
    }
    
    
}
