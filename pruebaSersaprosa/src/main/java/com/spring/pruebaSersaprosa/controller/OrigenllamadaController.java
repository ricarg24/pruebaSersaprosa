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
import com.spring.pruebaSersaprosa.model.Origenllamada;
import com.spring.pruebaSersaprosa.service.OrigenllamadaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class OrigenllamadaController {

	@Autowired OrigenllamadaService origenllamada;
	

	
	@PostMapping("/origenllamada")
	public Origenllamada save(@RequestBody Origenllamada gestion) {
		return origenllamada.save(gestion);
	}

	@GetMapping("/listarOrigenllamada")
	public List<Origenllamada> findAllGestion(){
		return origenllamada.findAll();
	}
	
	
	@GetMapping("/listarOrigenllamada/{id}")
	public Origenllamada listar(@PathVariable int id) {
		return origenllamada.findById(id);
	}
	
	@PutMapping("/origenllamada/{id}")
	public Origenllamada actualizar(@RequestBody Origenllamada gestion,@PathVariable int id) {
	
		Origenllamada gestionActual = origenllamada.findById(id);
		
		gestionActual.setOrigen_llamada(gestion.getOrigen_llamada());
		
		
		return origenllamada.save(gestionActual);
	}
	
	@DeleteMapping("/origenllamadaDel/{id}")
	public void delete(@PathVariable int id) {
		origenllamada.delete(id);
	}
}
