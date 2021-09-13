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

	@Bean
	public ServiceCity getServiceCity(){
		List<City> list = new ArrayList<>();
		City c1 = new City("Jaen", 300);
		City c2 = new City("Sevilla", 3000);
		list.add(c1);
		list.add(c2);
		ServiceCity ci = new ServiceCityImp();
		return ci;
	}
}
