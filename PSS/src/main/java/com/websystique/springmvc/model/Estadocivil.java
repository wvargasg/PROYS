package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "ESTADOCIVIL" database table.
 * 
 */
@Entity
@Table(name="\"ESTADOCIVIL\"")
@NamedQuery(name="Estadocivil.findAll", query="SELECT e FROM Estadocivil e")
public class Estadocivil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_ESTADOCIVIL\"")
	private Integer idEstadocivil;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Integer estado;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="estadocivil")
	private List<Persona> personas;

	public Estadocivil() {
	}

	public Integer getIdEstadocivil() {
		return this.idEstadocivil;
	}

	public void setIdEstadocivil(Integer idEstadocivil) {
		this.idEstadocivil = idEstadocivil;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setEstadocivil(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setEstadocivil(null);

		return persona;
	}

}