package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fabricante")
public class Fabricante {

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	//Constructor vacio
	public Fabricante() {
		
	}

	//Constructor con parametros
	public Fabricante(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	//Getters/Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
