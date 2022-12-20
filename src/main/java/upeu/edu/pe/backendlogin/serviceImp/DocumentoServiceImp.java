package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Documento;
import upeu.edu.pe.backendlogin.repository.DocumentoRepository;
import upeu.edu.pe.backendlogin.service.DocumentoService;

@Service
public class DocumentoServiceImp implements DocumentoService {
	
	@Autowired
	DocumentoRepository docrepo;

	@Override
	public List<Documento> readAllDocumento() {
		// TODO Auto-generated method stub
		return docrepo.findAll();
	}

	@Override
	public Optional<Documento> readOneDocumento(int id_documento) {
		// TODO Auto-generated method stub
		return docrepo.findById(id_documento);
	}

	@Override
	public Documento createDocumento(Documento documento) {
		// TODO Auto-generated method stub
		return docrepo.save(documento);
	}

	@Override
	public Documento updateDocumento(int id_documento, Documento documento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDocumento(int id_documento) {
		// TODO Auto-generated method stub
		docrepo.deleteById(id_documento);
	}

}
