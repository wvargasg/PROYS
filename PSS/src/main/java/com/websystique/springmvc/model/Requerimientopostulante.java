package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "REQUERIMIENTOPOSTULANTE" database table.
 * 
 */
@Entity
@Table(name="\"REQUERIMIENTOPOSTULANTE\"")
@NamedQuery(name="Requerimientopostulante.findAll", query="SELECT r FROM Requerimientopostulante r")
public class Requerimientopostulante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_REQUERIMIENTOPOSTULANTE\"")
	private Integer idRequerimientopostulante;

	@Column(name="\"ID_POSTULANTE\"")
	private Integer idPostulante;

	@Column(name="\"ID_REQUERIMIENTO\"")
	private Integer idRequerimiento;

	//bi-directional many-to-one association to Postulante
	@ManyToOne
	@JoinColumns({
		})
	private Postulante postulante;

	//bi-directional many-to-one association to Requerimiento
	@ManyToOne
	@JoinColumns({
		})
	private Requerimiento requerimiento;

	public Requerimientopostulante() {
	}

	public Integer getIdRequerimientopostulante() {
		return this.idRequerimientopostulante;
	}

	public void setIdRequerimientopostulante(Integer idRequerimientopostulante) {
		this.idRequerimientopostulante = idRequerimientopostulante;
	}

	public Integer getIdPostulante() {
		return this.idPostulante;
	}

	public void setIdPostulante(Integer idPostulante) {
		this.idPostulante = idPostulante;
	}

	public Integer getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Integer idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Postulante getPostulante() {
		return this.postulante;
	}

	public void setPostulante(Postulante postulante) {
		this.postulante = postulante;
	}

	public Requerimiento getRequerimiento() {
		return this.requerimiento;
	}

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

}