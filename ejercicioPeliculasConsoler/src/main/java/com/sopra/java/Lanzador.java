package com.sopra.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sopra.java.model.business.GestorPeliculas;
import com.sopra.java.model.dao.IPeliculasDAO;
import com.sopra.java.model.dao.PeliculasDAOImpl;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

public class Lanzador {
	
	private static ApplicationContext context;
	static {
		context=new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void main(String[] args) {
		
		
		GestorPeliculas gestorPeliculas=context.getBean(GestorPeliculas.class);
		IPeliculasDAO<Pelicula> miDAOPelis=context.getBean(PeliculasDAOImpl.class);
		//gestorPeliculas.setMiDAOPelis(miDAOPelis);
		
		Pelicula peli1,peli2,peli3,peli4,peli5,peli6,peli7,peli8,peli9,peli10;
		
		List<Pelicula> peliculas=new ArrayList<Pelicula>();
		
		peli1=gestorPeliculas.crearPelicula(
				"Star wars", "George Lucas", "", Arrays.asList(Categoria.CIENCIA_FICCION));
		peliculas.add(peli1);
		peli2=gestorPeliculas.crearPelicula(
				"Peli 2", "Pepito", "", Arrays.asList(Categoria.ACCION));
		peliculas.add(peli2);
		peli3=gestorPeliculas.crearPelicula(
				"Peli 3", "Jorgito", "", Arrays.asList(Categoria.COMEDIA));
		peliculas.add(peli3);
		peli4=gestorPeliculas.crearPelicula(
				"Peli 4", "Juan", "", Arrays.asList(Categoria.DRAMA,Categoria.COMEDIA));
		peliculas.add(peli4);
		peli5=gestorPeliculas.crearPelicula(
				"Peli 5", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli5);
		
		peli6=gestorPeliculas.crearPelicula(
				"Peli 6", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli6);
		peli7=gestorPeliculas.crearPelicula(
				"Peli 7", "Pedro", "", Arrays.asList(Categoria.TERROR));
		peliculas.add(peli7);
		peli8=gestorPeliculas.crearPelicula(
				"Peli 8", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli8);
		peli9=gestorPeliculas.crearPelicula(
				"Peli 9", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli9);
		peli10=gestorPeliculas.crearPelicula(
				"Peli 10", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli10);
		
		
		
		gestorPeliculas.altaPeliculas(peliculas);
		System.out.println(gestorPeliculas.listaPeliculas());
		
		
		peli3=gestorPeliculas.crearPelicula(
				"Peli 3", "David", "", Arrays.asList(Categoria.COMEDIA));
		peli8=gestorPeliculas.crearPelicula(
				"Peli 8", "Pedro", "", Arrays.asList(Categoria.TERROR));
		
		List<Pelicula> pelisAct=new ArrayList<Pelicula>();
		pelisAct.add(peli3);
		pelisAct.add(peli8);
		gestorPeliculas.updatePelicula(pelisAct);
		System.out.println(gestorPeliculas.listaPeliculas());
		
		
		List<Integer> idPelisBorrar=new ArrayList<Integer>();
		idPelisBorrar.add(5);
		idPelisBorrar.add(7);
		gestorPeliculas.deletePeliculas(idPelisBorrar);
		System.out.println(gestorPeliculas.listaPeliculas());
	}
}
