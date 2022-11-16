package com.ej1.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Articulo> articulos;
	
	public Fabricante() {}

	public Fabricante(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", articulos=" + articulos + "]";
	}
	
	
}
