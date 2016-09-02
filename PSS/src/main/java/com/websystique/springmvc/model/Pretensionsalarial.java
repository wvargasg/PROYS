package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "PRETENSIONSALARIAL" database table.
 * 
 */
@Entity
@Table(name="\"PRETENSIONSALARIAL\"")
@NamedQuery(name="Pretensionsalarial.findAll", query="SELECT p FROM Pretensionsalarial p")
public class Pretensionsalarial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_PRETENSIONSALARIAL\"")
	private Integer idPretensionsalarial;

	@Column(name="\"ID_POSTULANTE\"")
	private Integer idPostulante;

	@Column(name="\"ID_TIPOCONTRATACION\"")
	private Integer idTipocontratacion;

	@Column(name="\"SALARIOMAXIMO\"")
	private BigDecimal salariomaximo;

	@Column(name="\"SALARIOMINIMO\"")
	private BigDecimal salariominimo;

	//bi-directional many-to-one association to Postulante
	@ManyToOne
	@JoinColumns({
		})
	private Postulante postulante;

	//bi-directional many-to-one association to Tipocontratacion
	@ManyToOne
	@JoinColumns({
		})
	private Tipocontratacion tipocontratacion;

	public Pretensionsalarial() {
	}

	public Integer getIdPretensionsalarial() {
		return this.idPretensionsalarial;
	}

	public void setIdPretensionsalarial(Integer idPretensionsalarial) {
		this.idPretensionsalarial = idPretensionsalarial;
	}

	public Integer getIdPostulante() {
		return this.idPostulante;
	}

	public void setIdPostulante(Integer idPostulante) {
		this.idPostulante = idPostulante;
	}

	public Integer getIdTipocontratacion() {
		return this.idTipocontratacion;
	}

	public void setIdTipocontratacion(Integer idTipocontratacion) {
		this.idTipocontratacion = idTipocontratacion;
	}

	public BigDecimal getSalariomaximo() {
		return this.salariomaximo;
	}

	public void setSalariomaximo(BigDecimal salariomaximo) {
		this.salariomaximo = salariomaximo;
	}

	public BigDecimal getSalariominimo() {
		return this.salariominimo;
	}

	public void setSalariominimo(BigDecimal salariominimo) {
		this.salariominimo = salariominimo;
	}

	public Postulante getPostulante() {
		return this.postulante;
	}

	public void setPostulante(Postulante postulante) {
		this.postulante = postulante;
	}

	public Tipocontratacion getTipocontratacion() {
		return this.tipocontratacion;
	}

	public void setTipocontratacion(Tipocontratacion tipocontratacion) {
		this.tipocontratacion = tipocontratacion;
	}

}