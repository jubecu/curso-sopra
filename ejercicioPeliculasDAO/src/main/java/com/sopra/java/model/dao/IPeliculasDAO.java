package com.sopra.java.model.dao;

import java.util.Collection;

public interface IPeliculasDAO<Pelicula> {

	void create(Pelicula pelicula);
	
	Pelicula update(Pelicula pelicula);
	
	void delete(Pelicula pelicula);
	
	Collection<Pelicula> read();
	
	Pelicula readById(Integer identificador);
	
	
}
