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

import upeu.edu.pe.backendlogin.entity.Requisito;
import upeu.edu.pe.backendlogin.service.RequisitoService;


@RestController
@RequestMapping("/api/requisito")
@CrossOrigin({"*"})
public class RequisitoController {
	@Autowired
	RequisitoService requisitoService;
	
	@GetMapping("/listartodo")
	public List<Requisito> getRequisitos(){
		return requisitoService.readAllRequisito();
	}
	
	@GetMapping("/listar-requi/{id_requisito}")
	public Optional<Requisito> getRequisito(@PathVariable int id_requisito){
		return requisitoService.readOneRequisito(id_requisito);
	}

	@PostMapping("/crear-requisito")
	public Requisito create(@RequestBody Requisito requisito){
		return requisitoService.createRequisito(requisito);
	}
	
	@PutMapping("/actualizar-requisito/{id_requisito}")
	public Requisito update(@PathVariable int id_requisito, @RequestBody Requisito requisito){
		return requisitoService.updateRequisito(id_requisito, requisito);
	}
	
	@DeleteMapping("/borrar-requisito/{id_requisito}")
	public void delete(@PathVariable int id_requisito){
		requisitoService.deleteRequisito(id_requisito);
	}

}
