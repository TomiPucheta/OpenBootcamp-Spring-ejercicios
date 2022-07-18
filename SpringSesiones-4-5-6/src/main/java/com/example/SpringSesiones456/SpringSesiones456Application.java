package com.example.SpringSesiones456;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSesiones456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringSesiones456Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//insertar laptops

		LaptopEntidad laptop1 = new LaptopEntidad(null,"HP","Negro",550.0,true);
		LaptopEntidad laptop2 = new LaptopEntidad(null,"Lenovo","Gris",525.0,true);

		//guardar laptops

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
