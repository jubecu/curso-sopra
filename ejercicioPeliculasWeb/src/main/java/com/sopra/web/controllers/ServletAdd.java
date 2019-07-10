package com.sopra.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.java.model.business.GestorPeliculas;
import com.sopra.java.model.dao.PeliculasDAOImpl;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

@WebServlet("/add")
public class ServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public static GestorPeliculas gestorPeliculas=new GestorPeliculas(
			new PeliculasDAOImpl(new HashMap<Integer,Pelicula>()));
	
	private List<Pelicula> peliculas=new ArrayList<Pelicula>();
       
    public ServletAdd() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tit = request.getParameter("titulo");
		String dir = request.getParameter("director");
		String sin=request.getParameter("sinopsis");
		String categoria=request.getParameter("categoria");
		Categoria cat=Categoria.valueOf(categoria);
		List<Categoria> categorias=new ArrayList<Categoria>();
		categorias.add(cat);
		Pelicula peli=gestorPeliculas.crearPelicula(tit, dir, sin, categorias);
		
		peliculas.add(peli);
		gestorPeliculas.altaPeliculas(peliculas);
	}

}
