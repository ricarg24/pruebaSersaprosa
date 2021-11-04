package com.spring.pruebaSersaprosa.service;

import java.util.List;

import com.spring.pruebaSersaprosa.model.Gestion;
import com.spring.pruebaSersaprosa.model.Origenllamada;

public interface OrigenllamadaService {

	public Origenllamada save(Origenllamada gestion);
	public void delete(int id);
	
	public Origenllamada findById(int id);
	
	public List<Origenllamada> findAll();
}
