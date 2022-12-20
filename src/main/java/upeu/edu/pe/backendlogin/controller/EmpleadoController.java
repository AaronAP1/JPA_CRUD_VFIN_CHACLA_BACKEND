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

import upeu.edu.pe.backendlogin.entity.Empleado;
import upeu.edu.pe.backendlogin.service.EmpleadoService;


@RestController
@RequestMapping("/api/empleado")
@CrossOrigin({"*"})
public class EmpleadoController {
	
	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("/listartodo")
	public List<Empleado> getEmpleados(){
		return empleadoService.readAllEmpleado();
	}
	
	@GetMapping("/listar-id/{id_empleado}")
	public Optional<Empleado> getEmpleado(@PathVariable int id_empleado){
		return empleadoService.readOneEmpleado(id_empleado);
	}

	@PostMapping("/crear-empleado")
	public Empleado create(@RequestBody Empleado empleado){
		return empleadoService.createEmpleado(empleado);
	}
	
	@PutMapping("/actualizar-empleado/{id_empleado}")
	public Empleado update(@PathVariable int id_empleado, @RequestBody Empleado empleado){
		return empleadoService.updateEmpleado(id_empleado, empleado);
	}
	
	@DeleteMapping("/borrar-empleado/{id_empleado}")
	public void delete(@PathVariable int id_empleado){
		empleadoService.deleteEmpleado(id_empleado);
	}
	

}
