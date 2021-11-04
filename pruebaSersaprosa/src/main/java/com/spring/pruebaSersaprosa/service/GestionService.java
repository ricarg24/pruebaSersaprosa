package com.spring.pruebaSersaprosa.service;

import java.util.List;

import com.spring.pruebaSersaprosa.model.Gestion;

public interface GestionService {

	public Gestion save(Gestion gestion);
	public void delete(int id);
	
	public Gestion findById(int id);
	
	public List<Gestion> findAll();
	
	
	
	
	
}
