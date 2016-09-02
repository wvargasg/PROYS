package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "CONOCIMIENTO" database table.
 * 
 */
@Entity
@Table(name="\"CONOCIMIENTO\"")
@NamedQuery(name="Conocimiento.findAll", query="SELECT c FROM Conocimiento c")
public class Conocimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_CONOCIMIENTO\"")
	private Integer idConocimiento;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_CONOCIMIENTO\"")
	private Integer estadoConocimiento;

	@Column(name="\"ID_CONOCIMIENTOPADRE\"")
	private Integer idConocimientopadre;

	//bi-directional many-to-one association to Conocimiento
	@ManyToOne
	@JoinColumns({
		})
	private Conocimiento conocimiento;

	//bi-directional many-to-one association to Conocimiento
	@OneToMany(mappedBy="conocimiento")
	private List<Conocimiento> conocimientos;

	//bi-directional many-to-one association to Postulanteconocimiento
	@OneToMany(mappedBy="conocimiento")
	private List<Postulanteconocimiento> postulanteconocimientos;

	//bi-directional many-to-one association to Requerimientoconocimiento
	@OneToMany(mappedBy="conocimiento")
	private List<Requerimientoconocimiento> requerimientoconocimientos;

	public Conocimiento() {
	}

	public Integer getIdConocimiento() {
		return this.idConocimiento;
	}

	public void setIdConocimiento(Integer idConocimiento) {
		this.idConocimiento = idConocimiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoConocimiento() {
		return this.estadoConocimiento;
	}

	public void setEstadoConocimiento(Integer estadoConocimiento) {
		this.estadoConocimiento = estadoConocimiento;
	}

	public Integer getIdConocimientopadre() {
		return this.idConocimientopadre;
	}

	public void setIdConocimientopadre(Integer idConocimientopadre) {
		this.idConocimientopadre = idConocimientopadre;
	}

	public Conocimiento getConocimiento() {
		return this.conocimiento;
	}

	public void setConocimiento(Conocimiento conocimiento) {
		this.conocimiento = conocimiento;
	}

	public List<Conocimiento> getConocimientos() {
		return this.conocimientos;
	}

	public void setConocimientos(List<Conocimiento> conocimientos) {
		this.conocimientos = conocimientos;
	}

	public Conocimiento addConocimiento(Conocimiento conocimiento) {
		getConocimientos().add(conocimiento);
		conocimiento.setConocimiento(this);

		return conocimiento;
	}

	public Conocimiento removeConocimiento(Conocimiento conocimiento) {
		getConocimientos().remove(conocimiento);
		conocimiento.setConocimiento(null);

		return conocimiento;
	}

	public List<Postulanteconocimiento> getPostulanteconocimientos() {
		return this.postulanteconocimientos;
	}

	public void setPostulanteconocimientos(List<Postulanteconocimiento> postulanteconocimientos) {
		this.postulanteconocimientos = postulanteconocimientos;
	}

	public Postulanteconocimiento addPostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().add(postulanteconocimiento);
		postulanteconocimiento.setConocimiento(this);

		return postulanteconocimiento;
	}

	public Postulanteconocimiento removePostulanteconocimiento(Postulanteconocimiento postulanteconocimiento) {
		getPostulanteconocimientos().remove(postulanteconocimiento);
		postulanteconocimiento.setConocimiento(null);

		return postulanteconocimiento;
	}

	public List<Requerimientoconocimiento> getRequerimientoconocimientos() {
		return this.requerimientoconocimientos;
	}

	public void setRequerimientoconocimientos(List<Requerimientoconocimiento> requerimientoconocimientos) {
		this.requerimientoconocimientos = requerimientoconocimientos;
	}

	public Requerimientoconocimiento addRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().add(requerimientoconocimiento);
		requerimientoconocimiento.setConocimiento(this);

		return requerimientoconocimiento;
	}

	public Requerimientoconocimiento removeRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().remove(requerimientoconocimiento);
		requerimientoconocimiento.setConocimiento(null);

		return requerimientoconocimiento;
	}

}