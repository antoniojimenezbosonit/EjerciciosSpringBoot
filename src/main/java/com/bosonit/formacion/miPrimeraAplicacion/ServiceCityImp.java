package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Configuration
public class ServiceCityImp implements ServiceCity {

    List<City> cityList = new ArrayList<>();
    City c = new City();

    @Override
    public City addCity(String name, Integer numberOfInhabitants) {

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
