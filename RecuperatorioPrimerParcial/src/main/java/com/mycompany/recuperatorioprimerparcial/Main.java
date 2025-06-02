
package com.mycompany.recuperatorioprimerparcial;

import java.time.LocalDate;

/**
 *
 * @author Skywalker
 */
public class Main {

    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Regar");
        Tarea tarea2 = new Tarea ("Sembrar");
        Sector sector1 = new Sector(tarea1, "Sector Frutales", "Este sector cntiene plantas frutales.");
        Cultivo cultivo1 = new Cultivo("Manzano", TipoCultivo.FRUTAL, LocalDate.now(), sector1);
        cultivo1.generarCosecha(102.5);
        Sector sector2 = new Sector(tarea1, "Sector Aromáticas", "Este sector contiene plantas aromáticas.");
        Cultivo cultivo2 = new Cultivo("Tulipanes", TipoCultivo.AROMATICA, LocalDate.now(), sector2);
        cultivo2.generarCosecha(45.3);
        cultivo2.generarCosecha(45.7);
        Domicilio domicilio1 = new Domicilio("Manzanal", "323", "Yapeyú", "Éufrates");
        Voluntario voluntario1 = new Voluntario("Pepito", "234244", "Pepito@yandex.ru", domicilio1, "Tarde");
        voluntario1.realizarTarea(tarea2);
        voluntario1.realizarTarea(tarea1);
        Domicilio domicilio2 = new Domicilio("Manzanal","234","Yapeyú","Éufrates");
        Voluntario voluntario2 = new Voluntario("José", "234245", "Jose@gmail.com", domicilio2, "Mañana");
        Domicilio domicilio3 = new Domicilio("Bananal","234","Córdoba","Mendoza");
        Capacitador capacitador1 = new Capacitador("Usvciç", "543344", "usv@example.com", domicilio3, "Sembrado y arado");
        Capacitacion capacitacion1 = new Capacitacion("Sembrado y arado", capacitador1);
        capacitacion1.addVoluntario(voluntario2);
        capacitacion1.addVoluntario(voluntario1);
        Domicilio domicilio4 = new Domicilio("Peral","456","Xykuf","Ajgse");
        Donante donante1 = new Donante("Ricohli", "433231", "Ricohli@example.com", domicilio4);
        donante1.donar(TipoDonacion.DINERO, "Dona dinero para que planten más peras.");
        //-----------------------PRUEBAS DE FUNCIONAMIENTO------------------------
        System.out.println(donante1);
        donante1.mostrarDonaciones();
        System.out.println("");
        donante1.donar(TipoDonacion.HERRAMIENTAS,"Dona herramientas para que planten rápido las peras.");
        donante1.mostrarDonaciones();
        System.out.println("");
        System.out.println(cultivo2);
        System.out.println("");
        System.out.println(voluntario1);
        System.out.println("");
        System.out.println(capacitador1);
    }
}
