package edu.uspg.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer> {

}
