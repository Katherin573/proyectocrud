package edu.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uspg.model.Persona;
import edu.uspg.service.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> listar(){
		return service.listar();
	}
	 
	@PostMapping 
	public Persona registrar(Persona per) {
		return service.crear(per);
	}
	
	
}
