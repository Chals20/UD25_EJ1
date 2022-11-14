package controller;

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

import dto.Articulo;
import service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl art;
	
	@GetMapping("/articulo")
	public List<Articulo> listarArticulos(){
		return art.listarArticulos();
	}
	
	@GetMapping("/articulo/nombre/{nombre}")
	public List<Articulo> listarArticuloNombre(@PathVariable(name="nombre") String nombre){
		return art.listarArticuloNombre(nombre);
	}
	
	@PostMapping("/articulo")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {
		return art.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulo/{id}")
	public Articulo articuloXID(@PathVariable(name="codigo") int id) {
		
		Articulo articuloXId= new Articulo();
		
		articuloXId=art.articuloXID(id);
		
		System.out.println("Articulo XID: "+articuloXId);
		
		return articuloXId;
	}
	
	@PutMapping("/articulo/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo")int id,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();
		
		articulo_seleccionado= art.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());

		
		articulo_actualizado = art.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable(name="codigo")int id) {
		art.eliminarArticulo(id);
	}
}
