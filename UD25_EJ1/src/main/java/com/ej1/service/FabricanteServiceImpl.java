package com.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej1.dao.IFabricanteDAO;
import com.ej1.dto.Fabricante;



@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDAO dao;

	@Override
	public List<Fabricante> buscarFabricantes() {
		return dao.findAll();
	}

	@Override
	public void eliminarFabricante(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void guardarFabricante(Fabricante fabricante) {
		dao.save(fabricante);
		
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return dao.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXId(int id) {
		return dao.findById(id).get();
	}

}
