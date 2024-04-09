package com.softek.presentacion.Consumidor;

import com.softek.modelo.Producto;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Consumer;

public class ProbarConsumer {

    public void Mayus(){
        Consumer<String> imprime = x -> System.out.println(x.toUpperCase());

        imprime.accept("soy una cadena en mayus");

    }

    public void numerosCuadrados(){
        Consumer<Integer> numeros = x -> System.out.println("El cuadrado de " + x + " es : " + x * x);
        numeros.accept(5);

    }

    public void detallesProd(String tipo, double precio) {
        Consumer<String> objetos = x -> System.out.println(x + " Tipo: " + tipo + ", Precio: " + precio);
        objetos.accept("manzana");
    }

    public void mensajepanel(){
        Consumer<String> mensaje = x -> JOptionPane.showInternalMessageDialog(null,x);
        mensaje.accept("Mensaje Por panle OptionPane");
    }
    public void archivomsg() {
        Consumer<String> escribirArchivo = mensaje -> {
            try (FileWriter escritorArchivo = new FileWriter("EscribirFicheros.txt", true);
                 PrintWriter escritor = new PrintWriter(escritorArchivo)) {
                escritor.println(mensaje);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        escribirArchivo.accept("Mensaje PRUEBA ARCHIVO.");
    }


    public static void main(String[] args) {

        ProbarConsumer probar = new ProbarConsumer();

        probar.Mayus();

        probar.numerosCuadrados();

        probar.detallesProd("Fruta" , 2.99);

        probar.mensajepanel();


        probar.archivomsg();





    }
}
