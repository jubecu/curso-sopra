package com.sopra.spring.ejerPelisCloudEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EjercicioPeliculasCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPeliculasCloudEurekaApplication.class, args);
	}

}
