package upeu.edu.pe.backendlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.backendlogin.entity.SoliOrganizacion;

@Repository
public interface SoliOrganizacionRepository extends JpaRepository<SoliOrganizacion, Integer> {

}
