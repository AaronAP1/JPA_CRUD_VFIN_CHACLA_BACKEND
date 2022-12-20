package upeu.edu.pe.backendlogin.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Requisito;
import upeu.edu.pe.backendlogin.repository.RequisitoRepository;
import upeu.edu.pe.backendlogin.service.RequisitoService;

@Service
public class RequisitoServiceImp implements RequisitoService {
	
	@Autowired
	RequisitoRepository requiser;

	@Override
	public List<Requisito> readAllRequisito() {
		// TODO Auto-generated method stub
		return requiser.findAll();
	}

	@Override
	public Optional<Requisito> readOneRequisito(int id_requisito) {
		// TODO Auto-generated method stub
		return requiser.findById(id_requisito);
	}

	@Override
	public Requisito createRequisito(Requisito requisito) {
		// TODO Auto-generated method stub
		return requiser.save(requisito);
	}

	@Override
	public Requisito updateRequisito(int id_requisito, Requisito requisito) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRequisito(int id_requisito) {
		requiser.deleteById(id_requisito);
		
	}

}
