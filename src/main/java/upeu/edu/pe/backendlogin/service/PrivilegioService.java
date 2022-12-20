package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;


import upeu.edu.pe.backendlogin.entity.Privilegio;

public interface PrivilegioService {
	
	List<Privilegio> readAllPrivilegio();
	Optional<Privilegio> readOnePrivilegio(int id_privilegio);
	
	Privilegio createPrivilegio(Privilegio privilegio);
	Privilegio updatePrivilegio(int id_privilegio, Privilegio privilegio);
	void deletePrivilegio(int id_privilegio);
	

}
