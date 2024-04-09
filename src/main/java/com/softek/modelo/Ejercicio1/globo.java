package com.softek.modelo.Ejercicio1;

public  class globo {
    private final int id;

    public static int CONT = 0 ;


    public globo() {
        CONT++;
        this.id = CONT;
    }

    @Override
    public String toString() {
        return "globo{" +
                "id=" + id +
                '}';
    }
}
