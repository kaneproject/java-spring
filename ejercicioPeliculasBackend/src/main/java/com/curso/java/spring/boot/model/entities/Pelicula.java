package com.curso.java.spring.boot.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pelicula {
	
	@Id
	private String codId;
	private String titulo;
	private String director;
	private String genero;
	private Date fecha;
	private Integer valoracion;
	
	public Pelicula() {
		super();
	}

	public Pelicula(String codId, String titulo, String director, String genero, Date fecha, Integer valoracion) {
		super();
		this.codId = codId;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.fecha = fecha;
		this.valoracion = valoracion;
	}
	
	public String getCodId() {
		return codId;
	}
	public void setCodId(String codId) {
		this.codId = codId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getValoracion() {
		return valoracion;
	}
	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}
	

	
	
}
