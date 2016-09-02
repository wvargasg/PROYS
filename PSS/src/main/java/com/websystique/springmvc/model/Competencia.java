package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "COMPETENCIA" database table.
 * 
 */
@Entity
@Table(name="\"COMPETENCIA\"")
@NamedQuery(name="Competencia.findAll", query="SELECT c FROM Competencia c")
public class Competencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_COMPETENCIA\"")
	private Integer idCompetencia;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_COMPETENCIA\"")
	private Integer estadoCompetencia;

	//bi-directional many-to-one association to Requerimientocompetencia
	@OneToMany(mappedBy="competencia")
	private List<Requerimientocompetencia> requerimientocompetencias;

	public Competencia() {
	}

	public Integer getIdCompetencia() {
		return this.idCompetencia;
	}

	public void setIdCompetencia(Integer idCompetencia) {
		this.idCompetencia = idCompetencia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoCompetencia() {
		return this.estadoCompetencia;
	}

	public void setEstadoCompetencia(Integer estadoCompetencia) {
		this.estadoCompetencia = estadoCompetencia;
	}

	public List<Requerimientocompetencia> getRequerimientocompetencias() {
		return this.requerimientocompetencias;
	}

	public void setRequerimientocompetencias(List<Requerimientocompetencia> requerimientocompetencias) {
		this.requerimientocompetencias = requerimientocompetencias;
	}

	public Requerimientocompetencia addRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().add(requerimientocompetencia);
		requerimientocompetencia.setCompetencia(this);

		return requerimientocompetencia;
	}

	public Requerimientocompetencia removeRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().remove(requerimientocompetencia);
		requerimientocompetencia.setCompetencia(null);

		return requerimientocompetencia;
	}

}