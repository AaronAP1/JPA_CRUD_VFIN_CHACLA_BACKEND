package upeu.edu.pe.backendlogin.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.backendlogin.entity.Persona;
import upeu.edu.pe.backendlogin.service.PersonaService;


@RestController
@RequestMapping("/api/persona")
@CrossOrigin({"*"})
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/listartodo")
	public List<Persona> getPersonas(){
		return personaService.readAllPersona();
	}
	
	@GetMapping("/listar-persona/{id_persona}")
	public Optional<Persona> getPersona(@PathVariable int id_persona){
		return personaService.readOnePersona(id_persona);
	}

	@PostMapping("/crear-persona")
	public Persona create(@RequestBody Persona persona){
		return personaService.createPersona(persona);
	}
	
	@PutMapping("/actualizar-persona/{id_persona}")
	public Persona update(@PathVariable int id_persona, @RequestBody Persona persona){
		return personaService.updatePersona(id_persona, persona);
	}
	
	@DeleteMapping("/borrar-persona/{id_persona}")
	public void delete(@PathVariable int id_categoria){
		personaService.deletePersona(id_categoria);
	}

}
