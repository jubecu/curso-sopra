package com.sopra.java;

import java.util.HashMap;

import com.sopra.java.model.dao.PeliculasDAOImpl;
import com.sopra.java.model.dao.IPeliculasDAO;
import com.sopra.java.model.entities.Pelicula;

public class Factory {

	private static IPeliculasDAO<Pelicula> miPelisDAO;
	
	public static IPeliculasDAO<Pelicula> getDAOPelis(){
		if(miPelisDAO==null)
			miPelisDAO=new PeliculasDAOImpl(new HashMap<Integer,Pelicula>());
		return miPelisDAO;
	}
}
