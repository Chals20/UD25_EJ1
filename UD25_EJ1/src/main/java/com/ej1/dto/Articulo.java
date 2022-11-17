package com.ej1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {
	
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private int precio;
	
	@ManyToOne()
	@JoinColumn(name="fabricante")
	private Fabricante fabricante;
	
	public Articulo() {}

	public Articulo(int codigo, String nombre, int precio, Fabricante fabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
