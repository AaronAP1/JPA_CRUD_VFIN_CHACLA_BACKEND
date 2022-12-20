package upeu.edu.pe.backendlogin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.backendlogin.entity.Rol;
import upeu.edu.pe.backendlogin.service.RolService;


@RestController
@RequestMapping("/api/rol")
@CrossOrigin({"*"})
public class RolController {
	
	@Autowired
	RolService rolService;
	
	@GetMapping("/listartodo")
	public List<Rol> getRoles(){
		return rolService.readAllRol();
	}
	
	@GetMapping("/listar-rol/{id_rol}")
	public Optional<Rol> getRol(@PathVariable int id_rol){
		return rolService.readOneRol(id_rol);
	}

	@PostMapping("/crear-rol")
	public Rol create(@RequestBody Rol rol){
		return rolService.createRol(rol);
	}
	
	@PutMapping("/actualizar-rol/{id_rol}")
	public Rol update(@PathVariable int id_rol, @RequestBody Rol rol){
		return rolService.updateRol(id_rol, rol);
	}

}
