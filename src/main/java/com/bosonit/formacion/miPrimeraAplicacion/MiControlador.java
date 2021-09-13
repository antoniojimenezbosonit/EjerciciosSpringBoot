package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.web.bind.annotation.*;

@RestController
public class MiControlador {

    @GetMapping
    public String getHolaMundo(){
        return "Hola Mundo";
    }

    @GetMapping("/adios")
    public String dimeAdios(){
        return "Adios";
    }

    @GetMapping("/user/{nombre}")
    public String dimeTuNombre(@PathVariable String nombre){
        return "Hola: " + nombre;
    }

    @PostMapping("/userAdd")
    public Persona getPersona(@RequestBody Persona p){
        Persona persona = new Persona();
        persona.setName(p.getName());
        persona.setAge(p.getAge()+1);
        persona.setPoblation(p.getPoblation());

        return persona;
    }
}
