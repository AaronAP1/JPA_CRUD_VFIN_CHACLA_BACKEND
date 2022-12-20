package upeu.edu.pe.backendlogin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.backendlogin.entity.Documento;
import upeu.edu.pe.backendlogin.service.DocumentoService;


@RestController
@RequestMapping("/api/documento")
@CrossOrigin({"*"})
public class DocumentoController {
	
	@Autowired
	DocumentoService documentoService;
	
	@GetMapping("/listarDocs")
	public List<Documento> getDocumentos(){
		return documentoService.readAllDocumento();
	}
	
	@GetMapping("/listar-id/{id_documento}")
	public Optional<Documento>getDocumento(@PathVariable int id_documento){
		return documentoService.readOneDocumento(id_documento);
	}
	
	@PostMapping("/crear-documento")
	public Documento create(@RequestBody Documento documento) {
		return documentoService.createDocumento(documento);
	}
	
	@PutMapping("/actualizar-documento/{id_documento}")
	public Documento update(@PathVariable int id_documento, @RequestBody Documento documento) {
		return documentoService.updateDocumento(id_documento, documento);
	}
	
	@DeleteMapping("/borrar-documento/{id_documento}")
	public void delete(@PathVariable int id_documento) {
		documentoService.deleteDocumento(id_documento);
	}
	
	 
	
	

}
