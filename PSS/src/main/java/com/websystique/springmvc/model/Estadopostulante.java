package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "ESTADOPOSTULANTE" database table.
 * 
 */
@Entity
@Table(name="\"ESTADOPOSTULANTE\"")
@NamedQuery(name="Estadopostulante.findAll", query="SELECT e FROM Estadopostulante e")
public class Estadopostulante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_ESTADOPOSTULANTE\"")
	private Integer idEstadopostulante;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Integer estado;

	//bi-directional many-to-one association to Postulante
	@OneToMany(mappedBy="estadopostulante")
	private List<Postulante> postulantes;

	public Estadopostulante() {
	}

	public Integer getIdEstadopostulante() {
		return this.idEstadopostulante;
	}

	public void setIdEstadopostulante(Integer idEstadopostulante) {
		this.idEstadopostulante = idEstadopostulante;
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

	public List<Postulante> getPostulantes() {
		return this.postulantes;
	}

	public void setPostulantes(List<Postulante> postulantes) {
		this.postulantes = postulantes;
	}

	public Postulante addPostulante(Postulante postulante) {
		getPostulantes().add(postulante);
		postulante.setEstadopostulante(this);

		return postulante;
	}

	public Postulante removePostulante(Postulante postulante) {
		getPostulantes().remove(postulante);
		postulante.setEstadopostulante(null);

		return postulante;
	}

}