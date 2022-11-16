package com.ej1.service;

import java.util.List;

import com.ej1.dto.Fabricante;


public interface IFabricanteService {
	
	public List<Fabricante> buscarFabricantes();
	
	public void eliminarFabricante(int id);
	
	public void guardarFabricante(Fabricante fabricante);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public Fabricante fabricanteXId(int id);

}
