package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1{


    @Autowired
    ServicePerson sp;

    @Autowired
    ServiceCity ci;

    @GetMapping("controlador1/addPerson/{name}/{poblation}/{age}")
    public Person createPerson1(@PathVariable String name, @PathVariable String poblation, @PathVariable Integer age){
        return sp.createPerson(name, age, poblation);
    }

    @PostMapping("controlador1/addCity")
    public City addCity(@RequestBody City city){
        return ci.addCity(city.getName(), city.getNumberOfInhabitants());
    }





}
