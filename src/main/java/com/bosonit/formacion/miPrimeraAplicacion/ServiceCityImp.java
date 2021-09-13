package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Configuration
public class ServiceCityImp implements ServiceCity {

    City c1 = new City("Jaen", 100);
    City c2 = new City("Sevilla", 300);
    List<City> cityList = new ArrayList<City>(Arrays.asList(c1,c2));

    @Override
    public City addCity(String name, Integer numberOfInhabitants) {
        City c = new City();
        c.setName(name);
        c.setNumberOfInhabitants(numberOfInhabitants);
        cityList.add(c);
        return c;
    }

    @Override
    public List<City> getListOfCity() {
        return cityList;
    }

}
