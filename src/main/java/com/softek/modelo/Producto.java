package com.softek.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public final class Producto {

    public static int CONTADOR = 0;

    private final int id;
    private String nombre;
    private double precio;


    public Producto() {
        this.id = ++CONTADOR ;
    }

    private final double importe(int cantidad){
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
