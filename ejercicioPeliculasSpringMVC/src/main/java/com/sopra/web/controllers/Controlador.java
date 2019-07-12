package com.sopra.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.java.model.business.GestorPeliculas;
import com.sopra.java.model.entities.Categoria;
import com.sopra.java.model.entities.Pelicula;

@Controller
@Scope("request")
public class Controlador {
	
	@Autowired
	private GestorPeliculas gestor;
	

	@RequestMapping("home")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioSpringMVC");
	}

	@RequestMapping("muestrapelis")
	public ModelAndView muestrapelis(@RequestParam("titulo") String titulo, @RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis, @RequestParam("categoria") String categoria, HttpServletRequest request) {
		
		List<Pelicula> peliculas=new ArrayList<>();
		
		Categoria cat=Categoria.valueOf(categoria);
		List<Categoria> categorias=new ArrayList<Categoria>();
		categorias.add(cat);
		
		Pelicula pelicula=gestor.crearPelicula(titulo, director, sinopsis, categorias);
		peliculas.add(pelicula);
		
		
		ModelAndView modelAndView=new ModelAndView("muestraPelis");

		for(Pelicula peli:peliculas) {
			modelAndView.addObject("pelicula",peli);
		}
		
		return modelAndView;
	}
}
