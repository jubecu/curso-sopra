package com.sopra.java.model.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.java.model.dao.IPeliculasDAO;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

@Service
public class GestorPeliculas {

	@Autowired
	private IPeliculasDAO<Pelicula> miDAOPelis;
	//private static GestorPeliculas instance;
	
	public GestorPeliculas(IPeliculasDAO<Pelicula> miDAOPelis) {
		super();
		this.miDAOPelis = miDAOPelis;
	}
	
	/*public static GestorPeliculas getInstance(IPeliculasDAO<Pelicula> miDAOPelis) {
		if(instance==null)
			instance=new GestorPeliculas(miDAOPelis);
		return instance;
	}*/

	/*
	 * public void setMiDAOPelis(IPeliculasDAO<Pelicula> miDAOPelis) {
	 * this.miDAOPelis = miDAOPelis; }
	 */

	public Pelicula crearPelicula(
			String titulo, String director, String sinopsis, List<Categoria> categorias) {
		Pelicula pelicula=new Pelicula();
		pelicula.setIdentificador(Pelicula.getSecuencia().incrementAndGet());
		pelicula.setTitulo(titulo);
		pelicula.setDirector(director);
		pelicula.setSinopsis(sinopsis);
		pelicula.setCategorias(categorias);
		return pelicula;
	}
	
	public void altaPeliculas(List<Pelicula> peliculas) {
		for(Pelicula pelicula:peliculas) {
			miDAOPelis.create(pelicula);
		}
	}
	
	public List<Pelicula> listaPeliculas(){
		Collection<Pelicula> collPeliculas=miDAOPelis.read();
		List<Pelicula> listPeliculas=new ArrayList<Pelicula>();
		for(Pelicula peli: collPeliculas) {
			listPeliculas.add(peli);
		}
		return listPeliculas;
	}
	
	public void updatePelicula(List<Pelicula> peliculas) {
		for(Pelicula pelicula:peliculas) {
			miDAOPelis.update(pelicula);
		}
	}
	
	public void deletePeliculas(List<Integer> peliculasId) {
		for(Integer id:peliculasId) {
			Pelicula peli=miDAOPelis.readById(id);
			miDAOPelis.delete(peli);
		}
	}
}
