package com.softek.presentacion;

import com.softek.modelo.Ejercicio2.Calculadora;

public class ProbarCalculadora extends Calculadora {

    public static void main(String[] args) {
        System.out.println(Calculadora.suma(3,3));
        System.out.println(Calculadora.resta(5,2));
        System.out.println(Calculadora.multiplicacion(4,2));
        System.out.println(Calculadora.division(20,5));
    }
}
