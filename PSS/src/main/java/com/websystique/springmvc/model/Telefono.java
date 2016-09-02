package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "TELEFONO" database table.
 * 
 */
@Entity
@Table(name="\"TELEFONO\"")
@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Telefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TELEFONO\"")
	private Integer idTelefono;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ID_PERSONA\"")
	private Integer idPersona;

	@Column(name="\"ID_TIPOTELEFONO\"")
	private Integer idTipotelefono;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumns({
		})
	private Persona persona;

	//bi-directional many-to-one association to Tipotelefono
	@ManyToOne
	@JoinColumns({
		})
	private Tipotelefono tipotelefono;

	public Telefono() {
	}

	public Integer getIdTelefono() {
		return this.idTelefono;
	}

	public void setIdTelefono(Integer idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getIdTipotelefono() {
		return this.idTipotelefono;
	}

	public void setIdTipotelefono(Integer idTipotelefono) {
		this.idTipotelefono = idTipotelefono;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Tipotelefono getTipotelefono() {
		return this.tipotelefono;
	}

	public void setTipotelefono(Tipotelefono tipotelefono) {
		this.tipotelefono = tipotelefono;
	}

}