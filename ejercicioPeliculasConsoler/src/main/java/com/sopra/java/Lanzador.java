package com.sopra.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sopra.java.model.business.GestorPeliculas;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

public class Lanzador {

	public static void main(String[] args) {
		GestorPeliculas gestorPeliculas=new GestorPeliculas();
		Pelicula peli1,peli2,peli3,peli4,peli5,peli6,peli7,peli8,peli9,peli10;
		List<Pelicula> peliculas=new ArrayList<Pelicula>();
		
		peli1=gestorPeliculas.crearPelicula(
				1, "Star wars", "George Lucas", "", Arrays.asList(Categoria.CIENCIA_FICCION));
		peliculas.add(peli1);
		peli2=gestorPeliculas.crearPelicula(
				2, "Peli 2", "Pepito", "", Arrays.asList(Categoria.ACCION));
		peliculas.add(peli2);
		peli3=gestorPeliculas.crearPelicula(
				3, "Peli 3", "Jorgito", "", Arrays.asList(Categoria.COMEDIA));
		peliculas.add(peli3);
		peli4=gestorPeliculas.crearPelicula(
				4, "Peli 4", "Juan", "", Arrays.asList(Categoria.DRAMA,Categoria.COMEDIA));
		peliculas.add(peli4);
		peli5=gestorPeliculas.crearPelicula(
				5, "Peli 5", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli5);
		
		peli6=gestorPeliculas.crearPelicula(
				6, "Peli 6", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli6);
		peli7=gestorPeliculas.crearPelicula(
				7, "Peli 7", "Pedro", "", Arrays.asList(Categoria.TERROR));
		peliculas.add(peli7);
		peli8=gestorPeliculas.crearPelicula(
				8, "Peli 8", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli8);
		peli9=gestorPeliculas.crearPelicula(
				9, "Peli 9", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli9);
		peli10=gestorPeliculas.crearPelicula(
				10, "Peli 10", "Pedro", "", Arrays.asList(Categoria.SUSPENSE));
		peliculas.add(peli10);
		
		
		
		gestorPeliculas.altaPeliculas(peliculas);
		System.out.println(gestorPeliculas.listaPeliculas());
		
		
		peli3=gestorPeliculas.crearPelicula(
				3, "Peli 3", "David", "", Arrays.asList(Categoria.COMEDIA));
		peli8=gestorPeliculas.crearPelicula(
				8, "Peli 8", "Pedro", "", Arrays.asList(Categoria.TERROR));
		
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
