package com.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej1.dto.Articulo;
import com.ej1.dao.IArticuloDAO;


@Service
public class ArticuloServiceImpl implements IArticuloService{
	
	@Autowired
	IArticuloDAO dao;

	@Override
	public List<Articulo> buscarArticulos() {
		return dao.findAll();
	}

	@Override
	public void borrarArticulo(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public void guardarArticulo(Articulo articulo) {
		dao.save(articulo);
		
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return dao.save(articulo);	
	}

	@Override
	public Articulo articuloXId(int id) {
		return dao.findById(id).get();
	}

}
