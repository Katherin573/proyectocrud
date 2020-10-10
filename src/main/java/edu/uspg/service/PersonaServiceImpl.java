package edu.uspg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.DAO.IPersonaDAO;
import edu.uspg.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDAO dao;

	@Override
	public Persona crear(Persona per) {
		return dao.save(per);
	}

	@Override
	public Persona modificar(Persona per) {
		return dao.save(per);
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		return dao.findOne(id);
		//return null
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
		
	}
	
	

}
