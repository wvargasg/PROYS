package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "REQUERIMIENTOCOMPETENCIA" database table.
 * 
 */
@Entity
@Table(name="\"REQUERIMIENTOCOMPETENCIA\"")
@NamedQuery(name="Requerimientocompetencia.findAll", query="SELECT r FROM Requerimientocompetencia r")
public class Requerimientocompetencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_REQUERIMIENTOCOMPETENCIA\"")
	private Integer idRequerimientocompetencia;

	@Column(name="\"ID_COMPETENCIA\"")
	private Integer idCompetencia;

	@Column(name="\"ID_NIVELES\"")
	private Integer idNiveles;

	@Column(name="\"ID_REQUERIMIENTO\"")
	private Integer idRequerimiento;

	//bi-directional many-to-one association to Competencia
	@ManyToOne
	@JoinColumns({
		})
	private Competencia competencia;

	//bi-directional many-to-one association to Nivele
	@ManyToOne
	@JoinColumns({
		})
	private Nivele nivele;

	//bi-directional many-to-one association to Requerimiento
	@ManyToOne
	@JoinColumns({
		})
	private Requerimiento requerimiento;

	public Requerimientocompetencia() {
	}

	public Integer getIdRequerimientocompetencia() {
		return this.idRequerimientocompetencia;
	}

	public void setIdRequerimientocompetencia(Integer idRequerimientocompetencia) {
		this.idRequerimientocompetencia = idRequerimientocompetencia;
	}

	public Integer getIdCompetencia() {
		return this.idCompetencia;
	}

	public void setIdCompetencia(Integer idCompetencia) {
		this.idCompetencia = idCompetencia;
	}

	public Integer getIdNiveles() {
		return this.idNiveles;
	}

	public void setIdNiveles(Integer idNiveles) {
		this.idNiveles = idNiveles;
	}

	public Integer getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Integer idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public Nivele getNivele() {
		return this.nivele;
	}

	public void setNivele(Nivele nivele) {
		this.nivele = nivele;
	}

	public Requerimiento getRequerimiento() {
		return this.requerimiento;
	}

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

}