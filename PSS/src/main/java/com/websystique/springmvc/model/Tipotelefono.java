package com.websystique.springmvc.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the "TIPOTELEFONO" database table.
 * 
 */
@Entity
@Table(name="\"TIPOTELEFONO\"")
@NamedQuery(name="Tipotelefono.findAll", query="SELECT t FROM Tipotelefono t")
public class Tipotelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPOTELEFONO\"")
	private Integer idTipotelefono;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPOTELEFONO\"")
	private Integer estadoTipotelefono;

	//bi-directional many-to-one association to Telefono
	@OneToMany(mappedBy="tipotelefono")
	private List<Telefono> telefonos;

	public Tipotelefono() {
	}

	public Integer getIdTipotelefono() {
		return this.idTipotelefono;
	}

	public void setIdTipotelefono(Integer idTipotelefono) {
		this.idTipotelefono = idTipotelefono;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTipotelefono() {
		return this.estadoTipotelefono;
	}

	public void setEstadoTipotelefono(Integer estadoTipotelefono) {
		this.estadoTipotelefono = estadoTipotelefono;
	}

	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Telefono addTelefono(Telefono telefono) {
		getTelefonos().add(telefono);
		telefono.setTipotelefono(this);

		return telefono;
	}

	public Telefono removeTelefono(Telefono telefono) {
		getTelefonos().remove(telefono);
		telefono.setTipotelefono(null);

		return telefono;
	}

}