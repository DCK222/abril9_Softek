package com.softek.presentacion;

import com.softek.modelo.Ejercicio3.EstadoCivil;
import com.softek.modelo.Ejercicio3.Persona;

public class ProbarPersona  {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fede","Hombre", EstadoCivil.CASADO);
        System.out.println(persona1.toString());
        System.out.println(persona1.equals(persona1));
    }
}
