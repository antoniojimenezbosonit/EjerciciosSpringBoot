package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {

    @Autowired
    ServicePersonInterface sp;

    @GetMapping("controlador2/getPersona")
    public String getPersona(){
        Person p = sp.getPerson();
        return "Nombre: " + p.getName() + " Poblacion: " + p.getPoblation() + " Edad: " + p.getAge() * 2;
    }

    /*@GetMapping("controlador2/getCiudad")
    public List<Ciudad> getCiudades(){
        return sp.getListCiudades(ciudadInterfaceImp);
    }*/

}
