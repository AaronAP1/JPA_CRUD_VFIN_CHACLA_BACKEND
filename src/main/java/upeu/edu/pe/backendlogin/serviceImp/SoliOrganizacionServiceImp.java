package upeu.edu.pe.backendlogin.serviceImp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.backendlogin.entity.SoliOrganizacion;
import upeu.edu.pe.backendlogin.repository.SoliOrganizacionRepository;
import upeu.edu.pe.backendlogin.service.SoliOrganizacionService;

@Service
public class SoliOrganizacionServiceImp implements SoliOrganizacionService {
	
	@Autowired
	SoliOrganizacionRepository soliorgrepo;

	@Override
	public List<SoliOrganizacion> readAllSoliOrganizacion() {
		// TODO Auto-generated method stub
		return soliorgrepo.findAll();
	}

	@Override
	public Optional<SoliOrganizacion> readOneSoliOrganizacion(int id_soliorg) {
		// TODO Auto-generated method stub
		return soliorgrepo.findById(id_soliorg);
	}

	@Override
	public SoliOrganizacion createSoliOrganizacion(SoliOrganizacion soliorganizacion) {
		// TODO Auto-generated method stub
		return soliorgrepo.save(soliorganizacion);
	}

	@Override
	public SoliOrganizacion updateSoliOrganizacion(int id_soliorg, SoliOrganizacion SoliOrganizacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
