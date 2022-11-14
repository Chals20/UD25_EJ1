package dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricante")
public class Fabricante {

	// Atributos de entidad fabricante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Articulo> articulo;
	
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	/**
	 * @param video the video to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}
}
