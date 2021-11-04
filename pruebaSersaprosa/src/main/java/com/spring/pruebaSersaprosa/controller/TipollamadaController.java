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
import com.spring.pruebaSersaprosa.model.Tipollamada;
import com.spring.pruebaSersaprosa.service.OrigenllamadaService;
import com.spring.pruebaSersaprosa.service.TipollamadaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class TipollamadaController {
	
@Autowired TipollamadaService tipollamada;
	

	
	@PostMapping("/tipollamada")
	public Tipollamada save(@RequestBody Tipollamada gestion) {
		return tipollamada.save(gestion);
	}

	@GetMapping("/listarTipollamada")
	public List<Tipollamada> findAllGestion(){
		return tipollamada.findAll();
	}
	
	
	@GetMapping("/listarTipollamada/{id}")
	public Tipollamada listar(@PathVariable int id) {
		return tipollamada.findById(id);
	}
	
	@PutMapping("/tipollamada/{id}")
	public Tipollamada actualizar(@RequestBody Tipollamada gestion,@PathVariable int id) {
	
		Tipollamada gestionActual = tipollamada.findById(id);
		
		gestionActual.setTipo_llamada(gestion.getTipo_llamada());
		
		
		return tipollamada.save(gestionActual);
	}
	
	@DeleteMapping("/tipollamada/{id}")
	public void delete(@PathVariable int id) {
		tipollamada.delete(id);
	}
}
