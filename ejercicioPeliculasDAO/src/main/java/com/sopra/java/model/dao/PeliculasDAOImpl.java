package com.sopra.java.model.dao;

import java.util.Collection;
import java.util.Map;

import com.sopra.java.model.entities.Pelicula;

public class PeliculasDAOImpl implements IPeliculasDAO<Pelicula>{
	
	Map<Integer, Pelicula> peliculas;

	public PeliculasDAOImpl(Map<Integer, Pelicula> peliculas) {
		super();
		this.peliculas = peliculas;
	}

	public void create(Pelicula pelicula) {
		peliculas.putIfAbsent(pelicula.getIdentificador(), pelicula);
		
	}

	public Pelicula update(Pelicula pelicula) {
		if(peliculas.replace(pelicula.getIdentificador(), pelicula)!=null)
			return pelicula;
		return null;
	}

	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula.getIdentificador());
		
	}

	public Collection<Pelicula> read() {
		return peliculas.values();
	}

	public Pelicula readById(Integer identificador) {
		return peliculas.get(identificador);
	}

}
