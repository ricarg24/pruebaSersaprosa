package com.spring.pruebaSersaprosa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pruebaSersaprosa.dao.GestionDAO;
import com.spring.pruebaSersaprosa.model.Gestion;

@Service
public class GestionServiceImpl implements GestionService {

	@Autowired
	private GestionDAO gestionDAO;
	
	
	@Override
	@Transactional(readOnly = false)
	public Gestion save(Gestion gestion) {
		// TODO Auto-generated method stub
		return gestionDAO.save(gestion);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		gestionDAO.deleteById(id);
	}
	

	@Override
	@Transactional(readOnly = true)
	public Gestion findById(int id) {
		// TODO Auto-generated method stub
		return gestionDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Gestion> findAll() {
		// TODO Auto-generated method stub
		return (List<Gestion>) gestionDAO.findAll();
	}

}
