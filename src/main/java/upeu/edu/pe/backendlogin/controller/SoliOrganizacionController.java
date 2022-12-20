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

import upeu.edu.pe.backendlogin.entity.SoliOrganizacion;
import upeu.edu.pe.backendlogin.service.SoliOrganizacionService;


@RestController
@RequestMapping("/api/categoria")
@CrossOrigin({"*"})
public class SoliOrganizacionController {
	
	@Autowired
	SoliOrganizacionService soliorgService;
	
	@GetMapping("/listartodo")
	public List<SoliOrganizacion> getSoliOrganizaciones(){
		return soliorgService.readAllSoliOrganizacion();
	}
	
	@GetMapping("/listar-soliorg/{id_soliorg}")
	public Optional<SoliOrganizacion> getSoliOrganizacion(@PathVariable int id_soliorg){
		return soliorgService.readOneSoliOrganizacion(id_soliorg);
	}

	@PostMapping("/crear-soliorg")
	public SoliOrganizacion create(@RequestBody SoliOrganizacion soliOrganizacion){
		return soliorgService.createSoliOrganizacion(soliOrganizacion);
	}
	
	@PutMapping("/actualizar-soliorg/{id_soliorg}")
	public SoliOrganizacion update(@PathVariable int id_soliorg, @RequestBody SoliOrganizacion soliOrganizacion){
		return soliorgService.updateSoliOrganizacion(id_soliorg, soliOrganizacion);
	}

}
