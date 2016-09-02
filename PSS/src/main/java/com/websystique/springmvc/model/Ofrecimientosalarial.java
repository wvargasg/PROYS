package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "OFRECIMIENTOSALARIAL" database table.
 * 
 */
@Entity
@Table(name="\"OFRECIMIENTOSALARIAL\"")
@NamedQuery(name="Ofrecimientosalarial.findAll", query="SELECT o FROM Ofrecimientosalarial o")
public class Ofrecimientosalarial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_OFRECIMIENTOSALARIAL\"")
	private Integer idOfrecimientosalarial;

	@Column(name="\"ID_REQUERIMIENTO\"")
	private Integer idRequerimiento;

	@Column(name="\"ID_TIPOCONTRATACION\"")
	private Integer idTipocontratacion;

	@Column(name="\"MAXIMO\"")
	private BigDecimal maximo;

	@Column(name="\"MINIMO\"")
	private BigDecimal minimo;

	//bi-directional many-to-one association to Requerimiento
	@ManyToOne
	@JoinColumns({
		})
	private Requerimiento requerimiento;

	//bi-directional many-to-one association to Tipocontratacion
	@ManyToOne
	@JoinColumns({
		})
	private Tipocontratacion tipocontratacion;

	public Ofrecimientosalarial() {
	}

	public Integer getIdOfrecimientosalarial() {
		return this.idOfrecimientosalarial;
	}

	public void setIdOfrecimientosalarial(Integer idOfrecimientosalarial) {
		this.idOfrecimientosalarial = idOfrecimientosalarial;
	}

	public Integer getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Integer idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Integer getIdTipocontratacion() {
		return this.idTipocontratacion;
	}

	public void setIdTipocontratacion(Integer idTipocontratacion) {
		this.idTipocontratacion = idTipocontratacion;
	}

	public BigDecimal getMaximo() {
		return this.maximo;
	}

	public void setMaximo(BigDecimal maximo) {
		this.maximo = maximo;
	}

	public BigDecimal getMinimo() {
		return this.minimo;
	}

	public void setMinimo(BigDecimal minimo) {
		this.minimo = minimo;
	}

	public Requerimiento getRequerimiento() {
		return this.requerimiento;
	}

	public void setRequerimiento(Requerimiento requerimiento) {
		this.requerimiento = requerimiento;
	}

	public Tipocontratacion getTipocontratacion() {
		return this.tipocontratacion;
	}

	public void setTipocontratacion(Tipocontratacion tipocontratacion) {
		this.tipocontratacion = tipocontratacion;
	}

}