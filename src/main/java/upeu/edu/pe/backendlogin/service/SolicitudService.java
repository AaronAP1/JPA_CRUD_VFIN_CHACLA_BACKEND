package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;


import upeu.edu.pe.backendlogin.entity.Solicitud;

public interface SolicitudService {
	
	List<Solicitud> readAllSolicitud();
	Optional<Solicitud> readOneSolicitud(int id_solicitud);
	
	Solicitud createSolicitud(Solicitud solicitud);
	Solicitud updateSolicitud(int id_solicitud, Solicitud solicitud);


}
