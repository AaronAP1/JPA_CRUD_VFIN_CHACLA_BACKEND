package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.Solicitud;
import upeu.edu.pe.backendlogin.repository.SolicitudRepository;
import upeu.edu.pe.backendlogin.service.SolicitudService;

@Service
public class SolicitudServiceImp implements SolicitudService {
	
	@Autowired
	SolicitudRepository solirepo;

	@Override
	public List<Solicitud> readAllSolicitud() {
		// TODO Auto-generated method stub
		return solirepo.findAll();
	}

	@Override
	public Optional<Solicitud> readOneSolicitud(int id_solicitud) {
		// TODO Auto-generated method stub
		return solirepo.findById(id_solicitud);
	}

	@Override
	public Solicitud createSolicitud(Solicitud solicitud) {
		// TODO Auto-generated method stub
		return solirepo.save(solicitud);
	}

	@Override
	public Solicitud updateSolicitud(int id_solicitud, Solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}

}
