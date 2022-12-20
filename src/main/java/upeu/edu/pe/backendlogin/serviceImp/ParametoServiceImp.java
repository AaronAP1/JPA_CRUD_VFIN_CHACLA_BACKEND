package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Parametro;
import upeu.edu.pe.backendlogin.repository.ParametroRepository;
import upeu.edu.pe.backendlogin.service.ParametroService;

@Service
public class ParametoServiceImp implements ParametroService {
	
	@Autowired
	ParametroRepository pararepo;

	@Override
	public List<Parametro> readAllParametro() {
		// TODO Auto-generated method stub
		return pararepo.findAll();
	}

	@Override
	public Optional<Parametro> readOneParametro(int id_parametro) {
		// TODO Auto-generated method stub
		return pararepo.findById(id_parametro);
	}

	@Override
	public Parametro createParametro(Parametro parametro) {
		// TODO Auto-generated method stub
		return pararepo.save(parametro);
	}

	@Override
	public Parametro updateParametro(int id_parametro, Parametro parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteParametro(int id_parametro) {
		// TODO Auto-generated method stub
		pararepo.deleteById(id_parametro);
	}

}
