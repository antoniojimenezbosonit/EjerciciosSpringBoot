package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServicePersona{

    /*PersonInterface personInterface;

    public ServicePersona(PersonInterface personInterface1)
    {
        this.personInterface = personInterface1;
    };*/


    public Persona createPerson(String name, Integer age, String poblation, PersonInterface personInterface){

        return personInterface.savePerson(name, poblation, age);

    }

    public Persona getPersona(PersonInterface personInterface){
        return personInterface.getPerson();
    }

}
