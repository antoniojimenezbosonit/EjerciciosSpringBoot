package com.bosonit.formacion.miPrimeraAplicacion;

public class Ciudad {

    String nombre;
    Integer numeroDeHabitantes;

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer numeroDeHabitantes) {
        this.nombre = nombre;
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(Integer numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }
}
