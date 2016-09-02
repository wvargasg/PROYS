package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "POSTULANTECONOCIMIENTO" database table.
 * 
 */
@Entity
@Table(name="\"POSTULANTECONOCIMIENTO\"")
@NamedQuery(name="Postulanteconocimiento.findAll", query="SELECT p FROM Postulanteconocimiento p")
public class Postulanteconocimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_POSTULANTECONOCIMIENTO\"")
	private Integer idPostulanteconocimiento;

	@Column(name="\"ID_CONOCIMIENTO\"")
	private Integer idConocimiento;

	@Column(name="\"ID_NIVELES\"")
	private Integer idNiveles;

	@Column(name="\"ID_POSTULANTE\"")
	private Integer idPostulante;

	//bi-directional many-to-one association to Conocimiento
	@ManyToOne
	@JoinColumns({
		})
	private Conocimiento conocimiento;

	//bi-directional many-to-one association to Nivele
	@ManyToOne
	@JoinColumns({
		})
	private Nivele nivele;

	//bi-directional many-to-one association to Postulante
	@ManyToOne
	@JoinColumns({
		})
	private Postulante postulante;

	public Postulanteconocimiento() {
	}

	public Integer getIdPostulanteconocimiento() {
		return this.idPostulanteconocimiento;
	}

	public void setIdPostulanteconocimiento(Integer idPostulanteconocimiento) {
		this.idPostulanteconocimiento = idPostulanteconocimiento;
	}

	public Integer getIdConocimiento() {
		return this.idConocimiento;
	}

	public void setIdConocimiento(Integer idConocimiento) {
		this.idConocimiento = idConocimiento;
	}

	public Integer getIdNiveles() {
		return this.idNiveles;
	}

	public void setIdNiveles(Integer idNiveles) {
		this.idNiveles = idNiveles;
	}

	public Integer getIdPostulante() {
		return this.idPostulante;
	}

	public void setIdPostulante(Integer idPostulante) {
		this.idPostulante = idPostulante;
	}

	public Conocimiento getConocimiento() {
		return this.conocimiento;
	}

	public void setConocimiento(Conocimiento conocimiento) {
		this.conocimiento = conocimiento;
	}

	public Nivele getNivele() {
		return this.nivele;
	}

	public void setNivele(Nivele nivele) {
		this.nivele = nivele;
	}

	public Postulante getPostulante() {
		return this.postulante;
	}

	public void setPostulante(Postulante postulante) {
		this.postulante = postulante;
	}

}