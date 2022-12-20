package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Empleado;


public interface EmpleadoService {
	
	List<Empleado> readAllEmpleado();
	Optional<Empleado> readOneEmpleado(int id_empleado);
	
	Empleado createEmpleado(Empleado empleado);
	Empleado updateEmpleado(int id_empleado, Empleado empleado);
	void deleteEmpleado(int id_empleado);
	

}
