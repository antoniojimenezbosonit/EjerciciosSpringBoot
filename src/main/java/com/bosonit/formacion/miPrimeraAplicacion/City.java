package com.bosonit.formacion.miPrimeraAplicacion;

public class City {

    String name;
    Integer numberOfInhabitants;

    public City() {
    }

    public City(String nombre, Integer numeroDeHabitantes) {
        this.name = nombre;
        this.numberOfInhabitants = numeroDeHabitantes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfInhabitants() {
        return numberOfInhabitants;
    }

    public void setNumberOfInhabitants(Integer numberOfInhabitants) {
        this.numberOfInhabitants = numberOfInhabitants;
    }
}
