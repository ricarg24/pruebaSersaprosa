package com.spring.pruebaSersaprosa.controller;

import java.util.List;

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

import com.spring.pruebaSersaprosa.model.Gestion;
import com.spring.pruebaSersaprosa.service.GestionService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class GestionController {
  
	@Autowired
	private GestionService gestionService;
	
	@PostMapping("/gestiones")
	public Gestion save(@RequestBody Gestion gestion) {
		return gestionService.save(gestion);
	}

	@GetMapping("/listar")
	public List<Gestion> findAllGestion(){
		return gestionService.findAll();
	}
	
	
	@GetMapping("/listar/{id}")
	public Gestion listar(@PathVariable int id) {
		return gestionService.findById(id);
	}
	
	@PutMapping("/gestion/{id}")
	public Gestion actualizar(@RequestBody Gestion gestion,@PathVariable int id) {
	
		Gestion gestionActual = gestionService.findById(id);
		
		gestionActual.setGestion(gestion.getGestion());
		gestionActual.setNombre(gestion.getNombre());
		gestionActual.setTelefono(gestion.getTelefono());
		
		
		
		return gestionService.save(gestionActual);
	}
	
	@DeleteMapping("/gestion/{id}")
	public void delete(@PathVariable int id) {
		gestionService.delete(id);
	}
}
