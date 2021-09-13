package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Configuration
public class Controlador2 {

    @Autowired
    ServicePerson sp;

    @Autowired
    ServiceCity ci;

    @GetMapping("controlador2/getPersona")
    public String getPersona(){
        Person p = sp.getPerson();
        return "Nombre: " + p.getName() + " Poblacion: " + p.getPoblation() + " Edad: " + p.getAge() * 2;
    }

    @GetMapping("controlador2/getCity")
    public List<City> getCiudades(){
        return ci.getListOfCity();
    }

}
