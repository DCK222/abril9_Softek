package com.softek.presentacion.Predicate;

import java.util.function.Predicate;

public class Presentaciones {
    private void enteros(){

            Predicate<Integer> enteroPositivo = x -> x > 0;

            boolean resultado = enteroPositivo.test(3);
            System.out.println(resultado);
    }

    private void cadenavacia(){

        Predicate<String> vacio = cadena -> !cadena.isEmpty();

        boolean resultadocadena = vacio.test("");
        System.out.println(resultadocadena);
    }

    private void numerospares(){
        Predicate<Integer> espar = x -> x % 2 ==0;

        boolean resultadoespar = espar.test(5);
        System.out.println(resultadoespar);
    }
    private  void mayorque(){
        int numero = 5;
        Predicate<Integer> esmayor = x -> x > numero;
        boolean resultadomayor = esmayor.test(10);
        System.out.println("El numero es mayor que 5?? " + resultadomayor);
    }

    private void esprimo() {
        Predicate<Integer> esprimo = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };

        boolean resultadoPrimo = esprimo.test(7);
        System.out.println( "El numero es primo ?   " + resultadoPrimo);
    }


    public static void main(String[] args) {

        Presentaciones presentaciones = new Presentaciones();
        presentaciones.enteros();
        presentaciones.cadenavacia();
        presentaciones.numerospares();
        presentaciones.mayorque();


        presentaciones.esprimo();
    }
}
