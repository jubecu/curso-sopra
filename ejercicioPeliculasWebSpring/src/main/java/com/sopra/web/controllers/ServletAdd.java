package com.sopra.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.java.model.business.GestorPeliculas;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

@WebServlet("/add")
public class ServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ApplicationContext context;
	
	public static GestorPeliculas gestorPeliculas;
	
	private List<Pelicula> peliculas;
       
    public ServletAdd() {
        super();
        peliculas=new ArrayList<Pelicula>();
    }
    
    @Override
	public void init() throws ServletException {
		this.context=WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		gestorPeliculas=context.getBean(GestorPeliculas.class);
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
