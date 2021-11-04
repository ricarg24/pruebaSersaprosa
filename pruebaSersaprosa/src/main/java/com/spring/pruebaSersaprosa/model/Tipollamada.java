package com.spring.pruebaSersaprosa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipollamada")
public class Tipollamada implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTipo_llamada() {
		return tipo_llamada;
	}



	public void setTipo_llamada(String tipo_llamada) {
		this.tipo_llamada = tipo_llamada;
	}



	private String tipo_llamada;
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
}
