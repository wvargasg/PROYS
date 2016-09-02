package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TIPODOCUMENTO" database table.
 * 
 */
@Entity
@Table(name="\"TIPODOCUMENTO\"")
@NamedQuery(name="Tipodocumento.findAll", query="SELECT t FROM Tipodocumento t")
public class Tipodocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPODOCUMENTO\"")
	private Integer idTipodocumento;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPODOCUMENTO\"")
	private Integer estadoTipodocumento;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="tipodocumento")
	private List<Persona> personas;

	public Tipodocumento() {
	}

	public Integer getIdTipodocumento() {
		return this.idTipodocumento;
	}

	public void setIdTipodocumento(Integer idTipodocumento) {
		this.idTipodocumento = idTipodocumento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTipodocumento() {
		return this.estadoTipodocumento;
	}

	public void setEstadoTipodocumento(Integer estadoTipodocumento) {
		this.estadoTipodocumento = estadoTipodocumento;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setTipodocumento(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setTipodocumento(null);

		return persona;
	}

}