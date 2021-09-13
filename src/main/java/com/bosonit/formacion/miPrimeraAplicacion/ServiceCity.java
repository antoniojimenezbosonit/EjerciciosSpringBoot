package com.bosonit.formacion.miPrimeraAplicacion;

import java.util.ArrayList;
import java.util.List;

public interface ServiceCity {

    List<City> cityList = new ArrayList<>();
    public City addCity(String name, Integer numberOfInhabitants);
    public List<City> getListOfCity();
}
