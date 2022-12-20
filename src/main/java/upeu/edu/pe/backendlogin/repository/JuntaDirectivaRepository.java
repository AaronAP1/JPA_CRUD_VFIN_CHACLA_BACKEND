package upeu.edu.pe.backendlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.backendlogin.entity.JuntaDirectiva;

@Repository
public interface JuntaDirectivaRepository extends JpaRepository<JuntaDirectiva, Integer> {

}
