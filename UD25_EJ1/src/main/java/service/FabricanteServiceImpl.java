package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dto.Fabricante;
import dao.IFabricanteDAO;

public class FabricanteServiceImpl implements IFabricanteService{
	
	@Autowired
	IFabricanteDAO iFabricanteDao;
	

	@Override
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDao.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante f) {
		
		return iFabricanteDao.save(f);
	}

	@Override
	public Fabricante fabricanteXID(int id) {
		
		return iFabricanteDao.findById(id).get();
	}
	

	@Override
	public Fabricante actualizarFabricante(Fabricante f) {
		
		return iFabricanteDao.save(f);
	}

	@Override
	public void eliminarFabricante(int id) {
		
		iFabricanteDao.deleteById(id);
		
	}

	//Implementación metodo creado interfaz service
	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		// TODO Auto-generated method stub
		return iFabricanteDao.findByNombre(nombre);
	}
	

}
