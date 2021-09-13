package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador1{

    @Autowired
    PersonInterface personInterface;

    //ServicePersona sp = new ServicePersona(personInterface);
    ServicePersona sp = new ServicePersona();


    @GetMapping("controlador1/addPerson/{name}/{poblation}/{age}")
    public Persona createPerson1(@PathVariable String name, @PathVariable String poblation, @PathVariable Integer age){
        return sp.createPerson(name, age, poblation, personInterface);
    }


}
