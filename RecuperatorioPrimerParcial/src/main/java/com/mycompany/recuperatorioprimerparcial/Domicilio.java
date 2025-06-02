
package com.mycompany.recuperatorioprimerparcial;

/**
 *
 * @author lucaGomezB
 */
public class Domicilio {
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

    public Domicilio(String calle, String numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Domicilio{\n\tcalle=" + calle + "\n\tnumero=" + numero + "\n\tlocalidad=" + localidad + "\n\tprovincia=" + provincia + "\n}";
    }
    
    
}
