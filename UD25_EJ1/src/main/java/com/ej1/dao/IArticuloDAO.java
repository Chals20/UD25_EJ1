package com.ej1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ej1.dto.Articulo;


public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

	public List<Articulo> findAll();
	public void deleteById(int id);
}
