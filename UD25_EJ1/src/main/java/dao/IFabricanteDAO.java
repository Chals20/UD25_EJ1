package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{

	//Listar fabricantes por campo nombre
	public List<Fabricante> findByNombre(String nombre);
	
}
