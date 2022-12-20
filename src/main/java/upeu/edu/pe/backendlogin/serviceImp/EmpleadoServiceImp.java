package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Empleado;
import upeu.edu.pe.backendlogin.repository.EmpleadoRepository;
import upeu.edu.pe.backendlogin.service.EmpleadoService;


@Service
public class EmpleadoServiceImp implements EmpleadoService {
	
	@Autowired
	EmpleadoRepository emplearepo;

	@Override
	public List<Empleado> readAllEmpleado() {
		// TODO Auto-generated method stub
		return emplearepo.findAll();
	}

	@Override
	public Optional<Empleado> readOneEmpleado(int id_empleado) {
		// TODO Auto-generated method stub
		return emplearepo.findById(id_empleado);
	}

	@Override
	public Empleado createEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return emplearepo.save(empleado);
	}

	@Override
	public Empleado updateEmpleado(int id_empleado, Empleado empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmpleado(int id_empleado) {
		// TODO Auto-generated method stub
		emplearepo.deleteById(id_empleado);
	}

}
