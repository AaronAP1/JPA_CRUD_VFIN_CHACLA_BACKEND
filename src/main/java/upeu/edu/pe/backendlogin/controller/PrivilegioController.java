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


import upeu.edu.pe.backendlogin.entity.Privilegio;
import upeu.edu.pe.backendlogin.service.PrivilegioService;


@RestController
@RequestMapping("/api/privilegio")
@CrossOrigin({"*"})
public class PrivilegioController {
	
	@Autowired
	PrivilegioService privilegioService;
	
	@GetMapping("/listartodo")
	public List<Privilegio> getPrivilegios(){
		return privilegioService.readAllPrivilegio();
	}
	
	@GetMapping("/listar-privi/{id_privilegio}")
	public Optional<Privilegio> getPrivilegio(@PathVariable int id_privilegio){
		return privilegioService.readOnePrivilegio(id_privilegio);
	}

	@PostMapping("/crear-privilegio")
	public Privilegio create(@RequestBody Privilegio privilegio){
		return privilegioService.createPrivilegio(privilegio);
	}
	
	@PutMapping("/actualizar-privilegio/{id_privilegio}")
	public Privilegio update(@PathVariable int id_privilegio, @RequestBody Privilegio privilegio){
		return privilegioService.updatePrivilegio(id_privilegio, privilegio);
	}
	
	@DeleteMapping("/borrar-privilegio/{id_privilegio}")
	public void delete(@PathVariable int id_privilegio){
		privilegioService.deletePrivilegio(id_privilegio);
	}
	

}
