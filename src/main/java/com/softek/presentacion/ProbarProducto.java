package com.softek.presentacion;

import com.softek.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        System.out.println(Producto.CONTADOR);
        Producto producto1 = new Producto();
        System.out.println(producto1.toString());
        Producto producto2 = new Producto();
        System.out.println(producto2.toString());

    }
}
