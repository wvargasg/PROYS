package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "GRADOINSTRUCCION" database table.
 * 
 */
@Entity
@Table(name="\"GRADOINSTRUCCION\"")
@NamedQuery(name="Gradoinstruccion.findAll", query="SELECT g FROM Gradoinstruccion g")
public class Gradoinstruccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_GRADOINSTRUCCION\"")
	private Integer idGradoinstruccion;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_GRADOINSTRUCCION\"")
	private Integer estadoGradoinstruccion;

	//bi-directional many-to-one association to Postulante
	@OneToMany(mappedBy="gradoinstruccion")
	private List<Postulante> postulantes;

	public Gradoinstruccion() {
	}

	public Integer getIdGradoinstruccion() {
		return this.idGradoinstruccion;
	}

	public void setIdGradoinstruccion(Integer idGradoinstruccion) {
		this.idGradoinstruccion = idGradoinstruccion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoGradoinstruccion() {
		return this.estadoGradoinstruccion;
	}

	public void setEstadoGradoinstruccion(Integer estadoGradoinstruccion) {
		this.estadoGradoinstruccion = estadoGradoinstruccion;
	}

	public List<Postulante> getPostulantes() {
		return this.postulantes;
	}

	public void setPostulantes(List<Postulante> postulantes) {
		this.postulantes = postulantes;
	}

	public Postulante addPostulante(Postulante postulante) {
		getPostulantes().add(postulante);
		postulante.setGradoinstruccion(this);

		return postulante;
	}

	public Postulante removePostulante(Postulante postulante) {
		getPostulantes().remove(postulante);
		postulante.setGradoinstruccion(null);

		return postulante;
	}

}