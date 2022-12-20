package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;


import upeu.edu.pe.backendlogin.entity.SoliOrganizacion;

public interface SoliOrganizacionService {
		List<SoliOrganizacion> readAllSoliOrganizacion();
		
		
		Optional<SoliOrganizacion> readOneSoliOrganizacion(int id_soliorg);
		SoliOrganizacion createSoliOrganizacion(SoliOrganizacion soliorganizacion);
		SoliOrganizacion updateSoliOrganizacion(int id_soliorg, SoliOrganizacion SoliOrganizacion);
}
