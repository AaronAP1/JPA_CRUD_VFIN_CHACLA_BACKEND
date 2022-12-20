package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Documento;

public interface DocumentoService {

	List<Documento> readAllDocumento();
	Optional<Documento> readOneDocumento(int id_documento);
	
	Documento createDocumento(Documento documento);
	Documento updateDocumento(int id_documento, Documento documento);
	void deleteDocumento(int id_documento);
	
}
