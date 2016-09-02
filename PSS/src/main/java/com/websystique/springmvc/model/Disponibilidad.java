package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "DISPONIBILIDAD" database table.
 * 
 */
@Entity
@Table(name="\"DISPONIBILIDAD\"")
@NamedQuery(name="Disponibilidad.findAll", query="SELECT d FROM Disponibilidad d")
public class Disponibilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_DISPONIBILIDAD\"")
	private Integer idDisponibilidad;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_DISPONIBILIDAD\"")
	private Integer estadoDisponibilidad;

	//bi-directional many-to-one association to Postulante
	@OneToMany(mappedBy="disponibilidad")
	private List<Postulante> postulantes;

	public Disponibilidad() {
	}

	public Integer getIdDisponibilidad() {
		return this.idDisponibilidad;
	}

	public void setIdDisponibilidad(Integer idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoDisponibilidad() {
		return this.estadoDisponibilidad;
	}

	public void setEstadoDisponibilidad(Integer estadoDisponibilidad) {
		this.estadoDisponibilidad = estadoDisponibilidad;
	}

	public List<Postulante> getPostulantes() {
		return this.postulantes;
	}

	public void setPostulantes(List<Postulante> postulantes) {
		this.postulantes = postulantes;
	}

	public Postulante addPostulante(Postulante postulante) {
		getPostulantes().add(postulante);
		postulante.setDisponibilidad(this);

		return postulante;
	}

	public Postulante removePostulante(Postulante postulante) {
		getPostulantes().remove(postulante);
		postulante.setDisponibilidad(null);

		return postulante;
	}

}