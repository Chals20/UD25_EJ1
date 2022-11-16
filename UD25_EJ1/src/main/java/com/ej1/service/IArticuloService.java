package com.ej1.service;

import java.util.List;

import com.ej1.dto.Articulo;


public interface IArticuloService {
	
	public List<Articulo> buscarArticulos();
	
	public void borrarArticulo(int id);
	
	public void guardarArticulo(Articulo articulo);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public Articulo articuloXId(int id);

}
