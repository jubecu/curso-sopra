package com.sopra.spring.ejemplo15mvcresttemplateloadbalancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sopra.spring.ejemplo10restjpa.model.entities.Arma;

@Controller
public class MiControladorChachi {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("arma",new Arma());
		return "arma";
	}
	
	@RequestMapping("/listadoDeArmas")
	public String listadoDeArmas(Model model) {
		String urlDeAccesoAlServicio="http://ejemplo10restJPA/armas";
		ResponseEntity<List> respuestaDelServirdor = 
				restTemplate.exchange(urlDeAccesoAlServicio, HttpMethod.GET, null, List.class);
		List armas=respuestaDelServirdor.getBody();
		model.addAttribute("armas",armas);
		return "armas";
	}
	
	@RequestMapping("/nuevaArma")
	public String altaPelicula(@RequestParam("nombre") String nombre, @RequestParam("calibre") String calibre,Model model) {
		String urlDeAccesoAlServicio="http://ejemplo10restJPA/armas";
		Arma arma=new Arma(nombre,calibre); //Necesito nombre y calibre
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Arma> entidadAEnviar = new HttpEntity<Arma>(arma,headers);
		ResponseEntity<Arma> entity=restTemplate.exchange(
				urlDeAccesoAlServicio, HttpMethod.POST,entidadAEnviar/*necesito enviar el arma*/,Arma.class);
		Arma armaAlmacenda=entity.getBody();
		model.addAttribute("arma",armaAlmacenda);
		return "arma";
	}
}
