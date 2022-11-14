package service;

import java.util.List;

import dto.Fabricante;

public interface IFabricanteService {
	
	// Metodos del CRUD
	public List<Fabricante> listarFabricantes(); // Listar All

	public Fabricante guardarFabricante(Fabricante f); // Guarda un fabricante CREATE

	public Fabricante fabricanteXID(int id); // Leer datos de un fabricante READ

	public List<Fabricante> listarFabricanteNombre(String nomnbre);// Listar fabricante por campo nombre

	public Fabricante actualizarFabricante(Fabricante f); // Actualiza datos del fabricante UPDATE

	public void eliminarFabricante(int id);// Elimina el fabricante DELETE

}
