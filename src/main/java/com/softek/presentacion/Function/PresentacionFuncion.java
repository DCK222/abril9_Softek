package com.softek.presentacion.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PresentacionFuncion {

    public void lista() {
        List<Integer> numerosl = List.of(1, 34, 5, 3, 23, 63, 55,78, 31);
        Function<Integer , Integer> numerosparescalcu = x -> (x % 2 == 0) ? x : null;

        List<Integer> ListadePares = numerosl.stream().map(numerosparescalcu).filter(x -> x != null)
                .collect(Collectors.toList());

        System.out.println("Lista de numeros Pares : " + ListadePares);
    }


    public void calculoestadisticas(List<Double> numeros){

        Function<List<Double>, Double> numMinimo = x -> x.stream()
                .mapToDouble(Double::doubleValue).min().orElse(0);

        Function<List<Double>, Double> numMaximo = x -> x.stream().mapToDouble(Double::doubleValue)
                .max().orElse(0);

        Function<List<Double>, Double> medianum = x -> x.stream().mapToDouble(Double::doubleValue)
                .average().orElse(0);

        double masGrande = numMaximo.apply(numeros);
        double masPeque = numMinimo.apply(numeros);

        double avg = medianum.apply(numeros);

        System.out.println("Media de los numeros : " + avg);
        System.out.println("Numero mas grande de la lista : " + masGrande);
        System.out.println("Numero mas pequeño de la lista : " + masPeque);


    }


    public void validacioncontraseña(){
        String contraseñaCorrecta = "Softequian4%";

        String caracteresEspeciales = ".*[%&¿º].*";


        Function<String, Boolean> comprobarLongitud = x -> x.length() >= 8;

        Function <String, Boolean> comprobarMayus = x -> x.chars().anyMatch(Character::isUpperCase);
        Function <String, Boolean> comprobarminus = x -> x.chars().anyMatch(Character::isLowerCase);

        Function<String, Boolean> comprobarEspecial = x -> x.matches(caracteresEspeciales);

           boolean validarcont = comprobarLongitud.apply(contraseñaCorrecta) && comprobarMayus.apply(contraseñaCorrecta)&&
                   comprobarminus.apply(contraseñaCorrecta) && comprobarEspecial.apply(contraseñaCorrecta);

        System.out.println("Contraseña Valida : " + validarcont);


    }

    public static void main(String[] args) {

        PresentacionFuncion prueba = new PresentacionFuncion();
        prueba.lista();


        List<Double> ingrenum = List.of(100.32,12.54,1.76,4.3,2.9);
        prueba.calculoestadisticas(ingrenum);



        prueba.validacioncontraseña();


    }

}
