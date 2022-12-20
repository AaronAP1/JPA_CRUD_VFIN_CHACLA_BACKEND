package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Rol;
import upeu.edu.pe.backendlogin.repository.RolRepository;
import upeu.edu.pe.backendlogin.service.RolService;

@Service
public class RolServiceImp implements RolService {
	
	@Autowired
	RolRepository rolrepo;

	@Override
	public List<Rol> readAllRol() {
		// TODO Auto-generated method stub
		return rolrepo.findAll();
	}

	@Override
	public Optional<Rol> readOneRol(int id_rol) {
		// TODO Auto-generated method stub
		return rolrepo.findById(id_rol);
	}

	@Override
	public Rol createRol(Rol rol) {
		// TODO Auto-generated method stub
		return rolrepo.save(rol);
	}

	@Override
	public Rol updateRol(int id_rol, Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

}
