package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TIPOMONEDA" database table.
 * 
 */
@Entity
@Table(name="\"TIPOMONEDA\"")
@NamedQuery(name="Tipomoneda.findAll", query="SELECT t FROM Tipomoneda t")
public class Tipomoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPOMONEDA\"")
	private Integer idTipomoneda;

	@Column(name="\"ABREVIATURA\"")
	private String abreviatura;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPOMONEDA\"")
	private Integer estadoTipomoneda;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="tipomoneda")
	private List<Servicio> servicios;

	public Tipomoneda() {
	}

	public Integer getIdTipomoneda() {
		return this.idTipomoneda;
	}

	public void setIdTipomoneda(Integer idTipomoneda) {
		this.idTipomoneda = idTipomoneda;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTipomoneda() {
		return this.estadoTipomoneda;
	}

	public void setEstadoTipomoneda(Integer estadoTipomoneda) {
		this.estadoTipomoneda = estadoTipomoneda;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setTipomoneda(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setTipomoneda(null);

		return servicio;
	}

}