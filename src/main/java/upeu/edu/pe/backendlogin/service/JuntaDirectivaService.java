package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.JuntaDirectiva;


public interface JuntaDirectivaService {
	
	List<JuntaDirectiva> readAllJD();
	Optional<JuntaDirectiva> readOneJD(int id_jd);
	
	JuntaDirectiva createJD(JuntaDirectiva juntadirectiva);
	JuntaDirectiva updateJD(int id_jd, JuntaDirectiva juntadirectiva);
	void deleteJD(int id_jd);


}
