package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

	//Listar articulos por campo nombre
	public List<Articulo> findByNombre(String nombre);
}
