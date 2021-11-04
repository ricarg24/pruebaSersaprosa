package com.spring.pruebaSersaprosa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.pruebaSersaprosa.model.Origenllamada;
import com.spring.pruebaSersaprosa.model.Tipollamada;


public interface TipollamadaService {
	
	public Tipollamada save(Tipollamada gestion);
	public void delete(int id);
	
	public Tipollamada findById(int id);
	
	public List<Tipollamada> findAll();
}
