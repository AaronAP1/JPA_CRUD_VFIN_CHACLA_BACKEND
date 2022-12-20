package upeu.edu.pe.backendlogin.service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.backendlogin.entity.Categoria;

public interface CategoriaService {
	List<Categoria> readAllCategories();
	Optional<Categoria> readOneCategoria(int id_categoria);
	
	Categoria createCategoria(Categoria categoria);
	Categoria updateCategoria(int id_categoria, Categoria categoria);
	void deleteCategoria(int id_categoria);
	
}
