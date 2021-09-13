package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.stereotype.Component;

public interface PersonInterface {
    Persona savePerson(String name, String poblation, Integer age);
    Persona getPerson();
}
