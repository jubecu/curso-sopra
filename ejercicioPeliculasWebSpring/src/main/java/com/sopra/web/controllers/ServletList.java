package com.sopra.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.java.model.entities.Pelicula;

@WebServlet("/list")
public class ServletList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletList() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pelicula> listaPeliculas = ServletAdd.gestorPeliculas.listaPeliculas();
		request.setAttribute("peliculas",listaPeliculas);
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/listaPeliculas.jsp").forward(request, response);
	}

}
