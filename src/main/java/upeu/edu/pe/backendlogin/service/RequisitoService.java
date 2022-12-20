package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;


import upeu.edu.pe.backendlogin.entity.Requisito;


public interface RequisitoService {
	
	List<Requisito> readAllRequisito();
	Optional<Requisito> readOneRequisito(int id_requisito);
	
	Requisito createRequisito(Requisito requisito);
	Requisito updateRequisito(int id_requisito, Requisito requisito);
	void deleteRequisito(int id_requisito);


}
