package upeu.edu.pe.backendlogin.serviceImp; 


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.JuntaDirectiva;
import upeu.edu.pe.backendlogin.repository.JuntaDirectivaRepository;
import upeu.edu.pe.backendlogin.service.JuntaDirectivaService;

@Service
public class JuntaDirectivaServiceImp implements JuntaDirectivaService {
	
	@Autowired
	JuntaDirectivaRepository jdrepo;

	@Override
	public List<JuntaDirectiva> readAllJD() {
		// TODO Auto-generated method stub
		return jdrepo.findAll();
	}

	@Override
	public Optional<JuntaDirectiva> readOneJD(int id_jd) {
		// TODO Auto-generated method stub
		return jdrepo.findById(id_jd);
	}

	@Override
	public JuntaDirectiva createJD(JuntaDirectiva juntadirectiva) {
		// TODO Auto-generated method stub
		return jdrepo.save(juntadirectiva);
	}

	@Override
	public JuntaDirectiva updateJD(int id_jd, JuntaDirectiva juntadirectiva) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJD(int id_jd) {
		// TODO Auto-generated method stub
		jdrepo.deleteById(id_jd);
	}
	
	
	
	

}
