package edu.uspg.service;

import java.util.List;

import edu.uspg.model.Persona;

public interface IPersonaService {
	
	
	public Persona crear(Persona per) ;
	public Persona modificar(Persona per);
	public List<Persona> listar();
	public Persona listarPorId(Integer id);
	public void eliminar(Integer id);
}
