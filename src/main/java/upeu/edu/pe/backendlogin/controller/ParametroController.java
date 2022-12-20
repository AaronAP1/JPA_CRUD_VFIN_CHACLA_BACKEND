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


import upeu.edu.pe.backendlogin.entity.Parametro;
import upeu.edu.pe.backendlogin.service.ParametroService;


@RestController
@RequestMapping("/api/parametro")
@CrossOrigin({"*"})
public class ParametroController {
	
	@Autowired
	ParametroService parametroService;
	
	@GetMapping("/listartodo")
	public List<Parametro> getParametros(){
		return parametroService.readAllParametro();
	}
	
	@GetMapping("/listar-para/{id_parametro}")
	public Optional<Parametro> getParametro(@PathVariable int id_parametro){
		return parametroService.readOneParametro(id_parametro);
	}

	@PostMapping("/crear-parametro")
	public Parametro create(@RequestBody Parametro parametro){
		return parametroService.createParametro(parametro);
	}
	
	@PutMapping("/actualizar-parametro/{id_parametro}")
	public Parametro update(@PathVariable int id_parametro, @RequestBody Parametro parametro){
		return parametroService.updateParametro(id_parametro, parametro);
	}
	
	@DeleteMapping("/borrar-parametro/{id_parametro}")
	public void delete(@PathVariable int id_parametro){
		parametroService.deleteParametro(id_parametro);
	}
	

}
