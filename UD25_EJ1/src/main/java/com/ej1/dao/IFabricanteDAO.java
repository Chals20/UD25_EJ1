package com.ej1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ej1.dto.Fabricante;


public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{

	public List<Fabricante> findAll();
	
	public void deleteById(int id);
}
