package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("controlador2")
    ServiceCity ci;
    //CON EL CONTROLADOR2 MANEJANDO EL GET LOS DATOS INTRODUCIDOS EN EL COMTROLADOR1 NO VAN A SALIR
    //SI QUEREMOS VER LOS DATOS QUE VAMOS INTRODUCIENDO TENEMOS QUE USAR EL MISMO CONTROLADOR
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
