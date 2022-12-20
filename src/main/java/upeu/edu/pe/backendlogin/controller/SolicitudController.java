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

import upeu.edu.pe.backendlogin.entity.Solicitud;
import upeu.edu.pe.backendlogin.service.SolicitudService;


@RestController
@RequestMapping("/api/solicitud")
@CrossOrigin({"*"})
public class SolicitudController {
	
	@Autowired
	SolicitudService solicitudService;
	
	@GetMapping("/listartodo")
	public List<Solicitud> getSolicitudes(){
		return solicitudService.readAllSolicitud();
	}
	
	@GetMapping("/listar-solicitud/{id_solicitud}")
	public Optional<Solicitud> getSolicitud(@PathVariable int id_solicitud){
		return solicitudService.readOneSolicitud(id_solicitud);
	}

	@PostMapping("/crear-solicitud")
	public Solicitud create(@RequestBody Solicitud solicitud){
		return solicitudService.createSolicitud(solicitud);
	}
	
	@PutMapping("/update-solicitud/{id_solicitud}")
	public Solicitud update(@PathVariable int id_solicitud, @RequestBody Solicitud solicitud){
		return solicitudService.updateSolicitud(id_solicitud, solicitud);
	}

}
