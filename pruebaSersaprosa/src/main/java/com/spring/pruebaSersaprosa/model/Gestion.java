package com.spring.pruebaSersaprosa.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestion")
public class Gestion implements Serializable {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int tipo_llamada_id;
	private int origen_llamada_id;
	private String nombre;
	private String telefono;
	private String gestion;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getTipo_llamada_id() {
		return tipo_llamada_id;
	}




	public void setTipo_llamada_id(int tipo_llamada_id) {
		this.tipo_llamada_id = tipo_llamada_id;
	}




	public int getOrigen_llamada_id() {
		return origen_llamada_id;
	}




	public void setOrigen_llamada_id(int origen_llamada_id) {
		this.origen_llamada_id = origen_llamada_id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getGestion() {
		return gestion;
	}




	public void setGestion(String gestion) {
		this.gestion = gestion;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
