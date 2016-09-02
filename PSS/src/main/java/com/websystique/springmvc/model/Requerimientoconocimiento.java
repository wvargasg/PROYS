package com.websystique.springmvc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "REQUERIMIENTOCONOCIMIENTO" database table.
 * 
 */
@Entity
@Table(name="\"REQUERIMIENTOCONOCIMIENTO\"")
@NamedQuery(name="Requerimientoconocimiento.findAll", query="SELECT r FROM Requerimientoconocimiento r")
public class Requerimientoconocimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_REQUERIMIENTOCONOCIMIENTO\"")
	private Integer idRequerimientoconocimiento;

	@Column(name="\"ID_CONOCIMIENTO\"")
	private Integer idConocimiento;

	@Column(name="\"ID_NIVELES\"")
	private Integer idNiveles;

	@Column(name="\"ID_REQUERIMIENTO\"")
	private Integer idRequerimiento;

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

	//bi-directional many-to-one association to Requerimiento
	@ManyToOne
	@JoinColumns({
		})
	private Requerimiento requerimiento;

	public Requerimientoconocimiento() {
	}

	public Integer getIdRequerimientoconocimiento() {
		return this.idRequerimientoconocimiento;
	}

	public void setIdRequerimientoconocimiento(Integer idRequerimientoconocimiento) {
		this.idRequerimientoconocimiento = idRequerimientoconocimiento;
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

	public Integer getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Integer idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
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

	public Requerimiento getRequerimiento() {
		return this.requerimiento;
	}

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

}