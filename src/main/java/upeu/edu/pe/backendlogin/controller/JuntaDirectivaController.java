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


import upeu.edu.pe.backendlogin.entity.JuntaDirectiva;
import upeu.edu.pe.backendlogin.service.JuntaDirectivaService;


@RestController
@RequestMapping("/api/JuntaDirectiva")
@CrossOrigin({"*"})
public class JuntaDirectivaController {
	
	@Autowired
	JuntaDirectivaService jdService;
	
	@GetMapping("/listartodo")
	public List<JuntaDirectiva> getJuntaDirectivas(){
		return jdService.readAllJD();
	}
	
	@GetMapping("/listar-jd/{id_jd}")
	public Optional<JuntaDirectiva> getJuntaDirectiva(@PathVariable int id_jd){
		return jdService.readOneJD(id_jd);
		}

	@PostMapping("/crear-jd")
	public JuntaDirectiva create(@RequestBody JuntaDirectiva juntadirectiva){
		return jdService.createJD(juntadirectiva);
	}
	
	@PutMapping("/actualizar-jd/{id_jd}")
	public JuntaDirectiva update(@PathVariable int id_jd, @RequestBody JuntaDirectiva juntadirectiva){
		return jdService.updateJD(id_jd, juntadirectiva);
	}
	
	@DeleteMapping("/borrar-jd/{id_jd}")
	public void delete(@PathVariable int id_jd){
		jdService.deleteJD(id_jd);
	}

}
