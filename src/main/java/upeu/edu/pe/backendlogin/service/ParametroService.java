package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Parametro;
public interface ParametroService {
	
	List<Parametro> readAllParametro();
	Optional<Parametro> readOneParametro(int id_parametro);
	
	Parametro createParametro(Parametro parametro);
	Parametro updateParametro(int id_parametro, Parametro parametro);
	void deleteParametro(int id_parametro);
	

}
