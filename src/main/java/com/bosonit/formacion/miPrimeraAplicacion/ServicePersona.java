package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePersona implements ServicePersonInterface{

    Person p = new Person();



    public Person createPerson(String name, Integer age, String poblation){

        p.setName(name);
        p.setPoblation(poblation);
        p.setAge(age);

        return p;

    }

    public Person getPerson(){
        return p;
    }

    /*
    public Ciudad createCiudad(Ciudad c, CiudadInterfaceImp ciudadInterfaceImp){
        return ciudadInterfaceImp.addCiudad(c.getNombre(), c.getNumeroDeHabitantes());
    }

    public List<Ciudad> getListCiudades(CiudadInterfaceImp ciudadInterfaceImp){
        return ciudadInterfaceImp.getListaCiudades();
    }
*/
}
