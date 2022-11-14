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
import dto.Fabricante;

import service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl f;
	
	@GetMapping("/fabricante")
	public List<Fabricante> listarEmpleados(){
		return f.listarFabricantes();
	}
	
	@GetMapping("/fabricante/nombre/{nombre}")
	public List<Fabricante> listarEmpleadoNombre(@PathVariable(name="nombre") String nombre){
		return f.listarFabricanteNombre(nombre);
	}
	
	@PostMapping("/fabricante")
	public Fabricante salvarEmpleado(@RequestBody Fabricante fabricante) {
		return f.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricante empleadoXID(@PathVariable(name="id") int id) {
		
		Fabricante fabricanteXId= new Fabricante();
		
		fabricanteXId=f.fabricanteXID(id);
		
		System.out.println("Fabricante XID: "+fabricanteXId);
		
		return fabricanteXId;
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="id")int id,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= new Fabricante();
		Fabricante fabricante_actualizado= new Fabricante();
		
		fabricante_seleccionado= f.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());

		
		fabricante_actualizado = f.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable(name="id")int id) {
		f.eliminarFabricante(id);
	}
}
