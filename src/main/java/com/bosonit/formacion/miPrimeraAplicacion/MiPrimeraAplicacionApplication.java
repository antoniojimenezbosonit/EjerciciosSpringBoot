package com.bosonit.formacion.miPrimeraAplicacion;

import org.springframework.beans.factory.annotation.Qualifier;
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
	@Qualifier("controlador1")
	public ServiceCity getServiceCity(){

		ServiceCity ci = new ServiceCityImp();
		return ci;
	}

	@Bean
	@Qualifier("controlador2")
	public ServiceCity getServiceCity2(){

		ServiceCity ci = new ServiceCityImp();
		return ci;
	}
}
