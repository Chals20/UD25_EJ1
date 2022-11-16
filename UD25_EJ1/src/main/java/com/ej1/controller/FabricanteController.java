package com.ej1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ej1.dto.Fabricante;
import com.ej1.service.FabricanteServiceImpl;


@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fab;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> findAll() {
		return fab.buscarFabricantes();
	}
	
	@DeleteMapping("/articulo/{codigo}")
	public void eliminarFabricante(@PathVariable("codigo")int codigo) {
		fab.eliminarFabricante(codigo);
	}
	
	@PostMapping("/fabricante")
	public void create(@RequestBody Fabricante fabricante) {
		fab.guardarFabricante(fabricante);
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")int id,@RequestBody Fabricante fabricante) {
		
		Fabricante fab_select= new Fabricante();
		Fabricante fab_update= new Fabricante();
		
		fab_select= fab.fabricanteXId(id);
		
		fab_select.setNombre(fabricante.getNombre());
		
		fab_update = fab.actualizarFabricante(fab_select);
		
		System.out.println("El cliente actualizado es: "+ fab_update);
		
		return fab_update;
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXId(@PathVariable(name="codigo") int id) {
		
		Fabricante fabricanteId= new Fabricante();
		
		fabricanteId=fab.fabricanteXId(id);
		
		System.out.println("Fabricante XID: "+fabricanteId);
		
		return fabricanteId;
	}

}
