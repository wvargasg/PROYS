package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "POSTULANTE" database table.
 * 
 */
@Entity
@Table(name="\"POSTULANTE\"")
@NamedQuery(name="Postulante.findAll", query="SELECT p FROM Postulante p")
public class Postulante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_POSTULANTE\"")
	private Integer idPostulante;

	@Column(name="\"EXPERIENCIA\"")
	private Integer experiencia;

	@Column(name="\"HORASMAXIMO\"")
	private Integer horasmaximo;

	@Column(name="\"HORASMINIMO\"")
	private Integer horasminimo;

	@Column(name="\"ID_DISPONIBLIDAD\"")
	private Integer idDisponiblidad;

	@Column(name="\"ID_ESTADOPOSTULANTE\"")
	private Integer idEstadopostulante;

	@Column(name="\"ID_GRADOINSTRUCCION\"")
	private Integer idGradoinstruccion;

	@Column(name="\"ID_PERSONA\"")
	private Integer idPersona;

	@Column(name="\"OBSERVACIONES\"")
	private String observaciones;

	//bi-directional many-to-one association to Disponibilidad
	@ManyToOne
	@JoinColumns({
		})
	private Disponibilidad disponibilidad;

	//bi-directional many-to-one association to Estadopostulante
	@ManyToOne
	@JoinColumns({
		})
	private Estadopostulante estadopostulante;

	//bi-directional many-to-one association to Gradoinstruccion
	@ManyToOne
	@JoinColumns({
		})
	private Gradoinstruccion gradoinstruccion;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumns({
		})
	private Persona persona;

	//bi-directional many-to-one association to Postulanteconocimiento
	@OneToMany(mappedBy="postulante")
	private List<Postulanteconocimiento> postulanteconocimientos;

	//bi-directional many-to-one association to Pretensionsalarial
	@OneToMany(mappedBy="postulante")
	private List<Pretensionsalarial> pretensionsalarials;

	//bi-directional many-to-one association to Requerimientopostulante
	@OneToMany(mappedBy="postulante")
	private List<Requerimientopostulante> requerimientopostulantes;

	public Postulante() {
	}

	public Integer getIdPostulante() {
		return this.idPostulante;
	}

	public void setIdPostulante(Integer idPostulante) {
		this.idPostulante = idPostulante;
	}

	public Integer getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}

	public Integer getHorasmaximo() {
		return this.horasmaximo;
	}

	public void setHorasmaximo(Integer horasmaximo) {
		this.horasmaximo = horasmaximo;
	}

	public Integer getHorasminimo() {
		return this.horasminimo;
	}

	public void setHorasminimo(Integer horasminimo) {
		this.horasminimo = horasminimo;
	}

	public Integer getIdDisponiblidad() {
		return this.idDisponiblidad;
	}

	public void setIdDisponiblidad(Integer idDisponiblidad) {
		this.idDisponiblidad = idDisponiblidad;
	}

	public Integer getIdEstadopostulante() {
		return this.idEstadopostulante;
	}

	public void setIdEstadopostulante(Integer idEstadopostulante) {
		this.idEstadopostulante = idEstadopostulante;
	}

	public Integer getIdGradoinstruccion() {
		return this.idGradoinstruccion;
	}

	public void setIdGradoinstruccion(Integer idGradoinstruccion) {
		this.idGradoinstruccion = idGradoinstruccion;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Disponibilidad getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Estadopostulante getEstadopostulante() {
		return this.estadopostulante;
	}

	public void setEstadopostulante(Estadopostulante estadopostulante) {
		this.estadopostulante = estadopostulante;
	}

	public Gradoinstruccion getGradoinstruccion() {
		return this.gradoinstruccion;
	}

	public void setGradoinstruccion(Gradoinstruccion gradoinstruccion) {
		this.gradoinstruccion = gradoinstruccion;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Postulanteconocimiento> getPostulanteconocimientos() {
		return this.postulanteconocimientos;
	}

	public void setPostulanteconocimientos(List<Postulanteconocimiento> postulanteconocimientos) {
		this.postulanteconocimientos = postulanteconocimientos;
	}

	public Postulanteconocimiento addPostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().add(postulanteconocimiento);
		postulanteconocimiento.setPostulante(this);

		return postulanteconocimiento;
	}

	public Postulanteconocimiento removePostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().remove(postulanteconocimiento);
		postulanteconocimiento.setPostulante(null);

		return postulanteconocimiento;
	}

	public List<Pretensionsalarial> getPretensionsalarials() {
		return this.pretensionsalarials;
	}

	public void setPretensionsalarials(List<Pretensionsalarial> pretensionsalarials) {
		this.pretensionsalarials = pretensionsalarials;
	}

	public Pretensionsalarial addPretensionsalarial(Pretensionsalarial pretensionsalarial) {
		getPretensionsalarials().add(pretensionsalarial);
		pretensionsalarial.setPostulante(this);

		return pretensionsalarial;
	}

	public Pretensionsalarial removePretensionsalarial(Pretensionsalarial pretensionsalarial) {
		getPretensionsalarials().remove(pretensionsalarial);
		pretensionsalarial.setPostulante(null);

		return pretensionsalarial;
	}

	public List<Requerimientopostulante> getRequerimientopostulantes() {
		return this.requerimientopostulantes;
	}

	public void setRequerimientopostulantes(List<Requerimientopostulante> requerimientopostulantes) {
		this.requerimientopostulantes = requerimientopostulantes;
	}

	public Requerimientopostulante addRequerimientopostulante(Requerimientopostulante requerimientopostulante) {
		getRequerimientopostulantes().add(requerimientopostulante);
		requerimientopostulante.setPostulante(this);

		return requerimientopostulante;
	}

	public Requerimientopostulante removeRequerimientopostulante(Requerimientopostulante requerimientopostulante) {
		getRequerimientopostulantes().remove(requerimientopostulante);
		requerimientopostulante.setPostulante(null);

		return requerimientopostulante;
	}

}