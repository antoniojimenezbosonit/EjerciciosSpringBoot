package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.stereotype.Component;


@Component
public class PersonInterfaceImp implements PersonInterface{

    Persona p = new Persona();
    @Override
    public Persona savePerson(String name, String poblation, Integer age) {

        p.setAge(age);
        p.setPoblation(poblation);
        p.setName(name);
        return p;
    }

    @Override
    public Persona getPerson() {

        return p;
    }
}
