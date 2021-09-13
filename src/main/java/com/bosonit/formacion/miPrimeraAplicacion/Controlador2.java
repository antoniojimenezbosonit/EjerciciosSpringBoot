package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired
    PersonInterface personInterface;

    ServicePersona sp = new ServicePersona();

    @GetMapping("controlador2/getPersona")
    public String getPersona(){
        Persona p = sp.getPersona(personInterface);
        return "Nombre: " + p.getName() + " Poblacion: " + p.getPoblation() + " Edad: " + p.getAge() * 2;
    }



}
