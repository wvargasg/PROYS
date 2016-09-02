package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TIPOSERVICIO" database table.
 * 
 */
@Entity
@Table(name="\"TIPOSERVICIO\"")
@NamedQuery(name="Tiposervicio.findAll", query="SELECT t FROM Tiposervicio t")
public class Tiposervicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPOSERVICIO\"")
	private Integer idTiposervicio;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPOSERVICIO\"")
	private Integer estadoTiposervicio;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="tiposervicio")
	private List<Servicio> servicios;

	public Tiposervicio() {
	}

	public Integer getIdTiposervicio() {
		return this.idTiposervicio;
	}

	public void setIdTiposervicio(Integer idTiposervicio) {
		this.idTiposervicio = idTiposervicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTiposervicio() {
		return this.estadoTiposervicio;
	}

	public void setEstadoTiposervicio(Integer estadoTiposervicio) {
		this.estadoTiposervicio = estadoTiposervicio;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setTiposervicio(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setTiposervicio(null);

		return servicio;
	}

}