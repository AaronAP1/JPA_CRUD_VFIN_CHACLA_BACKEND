package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Privilegio;
import upeu.edu.pe.backendlogin.repository.PrivilegioRepository;
import upeu.edu.pe.backendlogin.service.PrivilegioService;

@Service
public class PrivilegioServiceImp implements PrivilegioService {
	
	@Autowired
	PrivilegioRepository privirepo;

	@Override
	public List<Privilegio> readAllPrivilegio() {
		// TODO Auto-generated method stub
		return privirepo.findAll();
	}

	@Override
	public Optional<Privilegio> readOnePrivilegio(int id_privilegio) {
		// TODO Auto-generated method stub
		return privirepo.findById(id_privilegio);
	}

	@Override
	public Privilegio createPrivilegio(Privilegio privilegio) {
		// TODO Auto-generated method stub
		return privirepo.save(privilegio);
	}

	@Override
	public Privilegio updatePrivilegio(int id_privilegio, Privilegio privilegio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePrivilegio(int id_privilegio) {
		// TODO Auto-generated method stub
		privirepo.deleteById(id_privilegio);
	}

}
