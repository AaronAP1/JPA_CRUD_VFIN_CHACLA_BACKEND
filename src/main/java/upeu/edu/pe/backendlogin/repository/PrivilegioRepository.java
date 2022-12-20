package upeu.edu.pe.backendlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.backendlogin.entity.Privilegio;

@Repository
public interface PrivilegioRepository extends JpaRepository<Privilegio, Integer> {

}
