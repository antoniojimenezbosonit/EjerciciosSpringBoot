package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MiPrimeraAplicacionApplication {


	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraAplicacionApplication.class, args);
	}


	//esto si lo creo como servicio al inicializar lo tengo
	/*@Bean
	public CiudadInterface getCiudadInterface(){
		List<Ciudad> lista = new ArrayList<>();
		Ciudad c1 = new Ciudad("Jaen", 300);
		Ciudad c2 = new Ciudad("Sevilla", 3000);
		lista.add(c1);
		lista.add(c2);
		CiudadInterface ci = new CiudadInterfaceImp(lista);
		return ci;
	}*/
}
