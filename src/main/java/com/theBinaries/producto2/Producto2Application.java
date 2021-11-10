package com.theBinaries.producto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.theBinaries")
@EnableJpaRepositories("com.theBinaries.producto2.Repository")
@EntityScan("com.theBinaries.producto2.entities")
public class Producto2Application {

	public static void main(String[] args) {
		SpringApplication.run(Producto2Application.class, args);
	}

}
