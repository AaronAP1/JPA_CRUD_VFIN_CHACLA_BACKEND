package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Persona;
import upeu.edu.pe.backendlogin.repository.PersonaRepository;
import upeu.edu.pe.backendlogin.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {
	
	@Autowired
	PersonaRepository perrepo;

	@Override
	public List<Persona> readAllPersona() {
		// TODO Auto-generated method stub
		return perrepo.findAll();
	}

	@Override
	public Optional<Persona> readOnePersona(int id_persona) {
		// TODO Auto-generated method stub
		return perrepo.findById(id_persona);
	}

	@Override
	public Persona createPersona(Persona persona) {
		// TODO Auto-generated method stub
		return perrepo.save(persona);
	}

	@Override
	public Persona updatePersona(int id_persona, Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePersona(int id_persona) {
		// TODO Auto-generated method stub
		perrepo.deleteById(id_persona);
	}
	

}
