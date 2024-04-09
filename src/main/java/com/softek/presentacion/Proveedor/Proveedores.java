package com.softek.presentacion.Proveedor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Proveedores {

    public int numeroaleatorio(){

        Supplier<Integer> numeroaleat = () ->{

            Random aleatorio = new Random();
            return aleatorio.nextInt(10);
        };
        return numeroaleat.get();
    }
        public void lista(){

            Supplier< List <Integer>> lisProvedor = () -> List.of(4,3,6,4,6,8);

            List<Integer> numeroslist = lisProvedor.get();
            System.out.println(numeroslist);

        }

        public void fecha(){
        Supplier<LocalDateTime> fechahora = LocalDateTime::now;
        LocalDateTime horaordenador = fechahora.get();
            System.out.println("Hora del ordenador : " + horaordenador);
        }

        public void cadenavacia(){
        Supplier<String> cadenavacia = () -> "   ";
        String cadena = cadenavacia.get();
            System.out.println( "cadena vacia : " + cadena);
        }

    public static void main(String[] args) {

        Proveedores prov = new Proveedores();

        int numeroran = prov.numeroaleatorio();
        System.out.println( "Numero aletorio del rango especificado : " + numeroran);

        prov.lista();

        prov.fecha();

        prov.cadenavacia();


    }
}
