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

import com.ej1.dto.Articulo;
import com.ej1.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl art;
	
	@GetMapping("/articulos")
	public List<Articulo> findAll() {
		return art.buscarArticulos();
	}
	
	@DeleteMapping("/fabricante/{codigo}")
	public void eliminarArticulo(@PathVariable("codigo")int codigo) {
		art.borrarArticulo(codigo);
	}
	
	@PostMapping("/articulo")
	public void create(@RequestBody Articulo articulo) {
		art.guardarArticulo(articulo);
	}
	
	@PutMapping("/articulo/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo")int id,@RequestBody Articulo articulo) {
		
		Articulo art_select= new Articulo();
		Articulo art_update= new Articulo();
		
		art_select= art.articuloXId(id);
		
		art_select.setNombre(articulo.getNombre());
		
		art_update = art.actualizarArticulo(art_select);
		
		System.out.println("El cliente actualizado es: "+ art_update);
		
		return art_update;
	}
	
	@GetMapping("/articulo/{id}")
	public Articulo articuloXId(@PathVariable(name="codigo") int id) {
		
		Articulo articuloId= new Articulo();
		
		articuloId=art.articuloXId(id);
		
		System.out.println("Articulo XID: "+articuloId);
		
		return articuloId;
	}

}
