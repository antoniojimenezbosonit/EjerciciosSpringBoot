package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MiPrimeraAplicacionApplication {


	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraAplicacionApplication.class, args);
	}

	@Bean
	@Primary
	public ServiceCity getServiceCity(){

		ServiceCity ci = new ServiceCityImp();
		ci.addCity("Jaen", 490);
		ci.addCity("Sevilla", 800);
		return ci;
	}
}
