package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;


import upeu.edu.pe.backendlogin.entity.Rol;
public interface RolService {
	
	List<Rol> readAllRol();
	Optional<Rol> readOneRol(int id_rol);
	
	Rol createRol(Rol rol);
	Rol updateRol(int id_rol, Rol rol);

	
}
