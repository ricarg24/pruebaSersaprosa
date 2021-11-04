package com.spring.pruebaSersaprosa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.pruebaSersaprosa.dao.TipollamadaDAO;
import com.spring.pruebaSersaprosa.model.Tipollamada;

@Service
public class TipollamadaServiceImpl implements TipollamadaService{

	@Autowired TipollamadaDAO tipollamadaDAO;
	
	@Override
	@Transactional(readOnly = false)
	public Tipollamada save(Tipollamada gestion) {
		// TODO Auto-generated method stub
		return tipollamadaDAO.save(gestion);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(int id) {
		// TODO Auto-generated method stub
		tipollamadaDAO.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipollamada findById(int id) {
		// TODO Auto-generated method stub
		return tipollamadaDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Tipollamada> findAll() {
		// TODO Auto-generated method stub
		return (List<Tipollamada>) tipollamadaDAO.findAll();
	}

}
