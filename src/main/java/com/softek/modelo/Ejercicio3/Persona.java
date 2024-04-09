package com.softek.modelo.Ejercicio3;

import java.util.Objects;

public class Persona {
  private String persona;
  private String genero;
  private EstadoCivil estadoCivil;

    public Persona(String persona, String genero, EstadoCivil estadoCivil) {
        this.persona = persona;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "persona='" + persona + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona1 = (Persona) o;
        return Objects.equals(persona, persona1.persona) && Objects.equals(genero, persona1.genero) && estadoCivil == persona1.estadoCivil;
    }

}
