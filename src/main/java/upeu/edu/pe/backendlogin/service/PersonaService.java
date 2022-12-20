package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Persona;

public interface PersonaService {
	List<Persona> readAllPersona();
	Optional<Persona> readOnePersona(int id_persona);
	
	Persona createPersona(Persona persona);
	Persona updatePersona(int id_persona, Persona persona);
	void deletePersona(int id_persona);
	
}
