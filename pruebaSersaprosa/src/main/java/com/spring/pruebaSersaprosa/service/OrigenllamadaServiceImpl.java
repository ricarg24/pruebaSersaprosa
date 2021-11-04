package com.spring.pruebaSersaprosa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pruebaSersaprosa.dao.OrigenllamadaDAO;
import com.spring.pruebaSersaprosa.model.Origenllamada;

@Service
public class OrigenllamadaServiceImpl implements OrigenllamadaService{

	@Autowired OrigenllamadaDAO origenllamadaDAO;
	
	@Override
	@Transactional(readOnly = false)
	public Origenllamada save(Origenllamada gestion) {
		// TODO Auto-generated method stub
		return origenllamadaDAO.save(gestion);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(int id) {
		// TODO Auto-generated method stub
		origenllamadaDAO.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Origenllamada findById(int id) {
		// TODO Auto-generated method stub
		return origenllamadaDAO.findById(id).orElse(null);
	}

	@Override
	public List<Origenllamada> findAll() {
		// TODO Auto-generated method stub
		return (List<Origenllamada>) origenllamadaDAO.findAll();
	}

}
