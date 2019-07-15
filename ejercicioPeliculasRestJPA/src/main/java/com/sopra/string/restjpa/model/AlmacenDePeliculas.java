package com.sopra.string.restjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.string.restjpa.model.entities.Pelicula;

public interface AlmacenDePeliculas extends JpaRepository<Pelicula, Integer>{

}
