package com.sopra.java.model.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sopra.java.model.dao.IPeliculasDAO;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

public class GestorPeliculas {

	private IPeliculasDAO<Pelicula> miDAOPelis;
	
	public void setMiDAOPelis(IPeliculasDAO<Pelicula> miDAOPelis) {
		this.miDAOPelis = miDAOPelis;
	}

	public Pelicula crearPelicula(
			Integer id, String titulo, String director, String sinopsis, List<Categoria> categorias) {
		Pelicula pelicula=new Pelicula();
		pelicula.setIdentificador(id);
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
