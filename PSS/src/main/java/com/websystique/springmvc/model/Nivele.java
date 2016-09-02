package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "NIVELES" database table.
 * 
 */
@Entity
@Table(name="\"NIVELES\"")
@NamedQuery(name="Nivele.findAll", query="SELECT n FROM Nivele n")
public class Nivele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_NIVELES\"")
	private Integer idNiveles;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_NIVELES\"")
	private Integer estadoNiveles;

	//bi-directional many-to-one association to Postulanteconocimiento
	@OneToMany(mappedBy="nivele")
	private List<Postulanteconocimiento> postulanteconocimientos;

	//bi-directional many-to-one association to Requerimientocompetencia
	@OneToMany(mappedBy="nivele")
	private List<Requerimientocompetencia> requerimientocompetencias;

	//bi-directional many-to-one association to Requerimientoconocimiento
	@OneToMany(mappedBy="nivele")
	private List<Requerimientoconocimiento> requerimientoconocimientos;

	public Nivele() {
	}

	public Integer getIdNiveles() {
		return this.idNiveles;
	}

	public void setIdNiveles(Integer idNiveles) {
		this.idNiveles = idNiveles;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoNiveles() {
		return this.estadoNiveles;
	}

	public void setEstadoNiveles(Integer estadoNiveles) {
		this.estadoNiveles = estadoNiveles;
	}

	public List<Postulanteconocimiento> getPostulanteconocimientos() {
		return this.postulanteconocimientos;
	}

	public void setPostulanteconocimientos(List<Postulanteconocimiento> postulanteconocimientos) {
		this.postulanteconocimientos = postulanteconocimientos;
	}

	public Postulanteconocimiento addPostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().add(postulanteconocimiento);
		postulanteconocimiento.setNivele(this);

		return postulanteconocimiento;
	}

	public Postulanteconocimiento removePostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().remove(postulanteconocimiento);
		postulanteconocimiento.setNivele(null);

		return postulanteconocimiento;
	}

	public List<Requerimientocompetencia> getRequerimientocompetencias() {
		return this.requerimientocompetencias;
	}

	public void setRequerimientocompetencias(List<Requerimientocompetencia> requerimientocompetencias) {
		this.requerimientocompetencias = requerimientocompetencias;
	}

	public Requerimientocompetencia addRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().add(requerimientocompetencia);
		requerimientocompetencia.setNivele(this);

		return requerimientocompetencia;
	}

	public Requerimientocompetencia removeRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().remove(requerimientocompetencia);
		requerimientocompetencia.setNivele(null);

		return requerimientocompetencia;
	}

	public List<Requerimientoconocimiento> getRequerimientoconocimientos() {
		return this.requerimientoconocimientos;
	}

	public void setRequerimientoconocimientos(List<Requerimientoconocimiento> requerimientoconocimientos) {
		this.requerimientoconocimientos = requerimientoconocimientos;
	}

	public Requerimientoconocimiento addRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().add(requerimientoconocimiento);
		requerimientoconocimiento.setNivele(this);

		return requerimientoconocimiento;
	}

	public Requerimientoconocimiento removeRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().remove(requerimientoconocimiento);
		requerimientoconocimiento.setNivele(null);

		return requerimientoconocimiento;
	}

}