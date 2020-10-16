package edu.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uspg.model.Persona;
import edu.uspg.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> listar(){ 
		
		return service.listar();
	}
	
	@GetMapping(value = "/{id}")
	public Persona listarPorId(@PathVariable("id") Integer id) {
		return service.listarPorId(id);
	}
	 
	@PostMapping 
	public Persona registrar(@RequestBody Persona per) {
		return service.crear(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
	}
	
}
