package service;

import java.util.List;

import dto.Articulo;

public interface IArticuloService {

	// Metodos del CRUD
		public List<Articulo> listarArticulos(); // Listar All

		public Articulo guardarArticulo(Articulo a); // Guarda un articulo CREATE

		public Articulo articuloXID(int id); // Leer datos de un articulo READ

		public List<Articulo> listarArticuloNombre(String nomnbre);// Listar articulo por campo nombre

		public Articulo actualizarArticulo(Articulo a); // Actualiza datos del articulo UPDATE

		public void eliminarArticulo(int id);// Elimina el articulo DELETE
}
