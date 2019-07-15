package com.sopra.string.restjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.string.restjpa.model.AlmacenDePeliculas;
import com.sopra.string.restjpa.model.entities.Pelicula;

@Configuration
public class SpringConfiguration {

	@Bean
	public CommandLineRunner iniciarBaseDeDatos(AlmacenDePeliculas almacen) {
		return args -> {
			almacen.save(new Pelicula("Tiburon","Spielberg","Dinamica","Acción"));
			almacen.save(new Pelicula("Titanic","James Cameron","Larga","Drama"));
			almacen.save(new Pelicula("Pulp Fiction","Tarantino","Muy buena","Acción"));
		};
	}
}
