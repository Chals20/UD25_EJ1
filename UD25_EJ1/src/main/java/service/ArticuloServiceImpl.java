package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IArticuloDAO;
import dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO art;
	
	@Override
	public List<Articulo> listarArticulos() {
		return art.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo a) {
		return art.save(a);
	}

	@Override
	public Articulo articuloXID(int id) {
		return art.findById(id).get();
	}

	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		return art.findByNombre(nombre);
	}

	@Override
	public Articulo actualizarArticulo(Articulo a) {
		return art.save(a);
	}

	@Override
	public void eliminarArticulo(int id) {
		art.deleteById(id);
	}

}
