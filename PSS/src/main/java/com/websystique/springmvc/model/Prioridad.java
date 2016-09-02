package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "PRIORIDAD" database table.
 * 
 */
@Entity
@Table(name="\"PRIORIDAD\"")
@NamedQuery(name="Prioridad.findAll", query="SELECT p FROM Prioridad p")
public class Prioridad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_PRIORIDAD\"")
	private Integer idPrioridad;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_PRIORIDAD\"")
	private Integer estadoPrioridad;

	//bi-directional many-to-one association to Requerimiento
	@OneToMany(mappedBy="prioridad")
	private List<Requerimiento> requerimientos;

	public Prioridad() {
	}

	public Integer getIdPrioridad() {
		return this.idPrioridad;
	}

	public void setIdPrioridad(Integer idPrioridad) {
		this.idPrioridad = idPrioridad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoPrioridad() {
		return this.estadoPrioridad;
	}

	public void setEstadoPrioridad(Integer estadoPrioridad) {
		this.estadoPrioridad = estadoPrioridad;
	}

	public List<Requerimiento> getRequerimientos() {
		return this.requerimientos;
	}

	public void setRequerimientos(List<Requerimiento> requerimientos) {
		this.requerimientos = requerimientos;
	}

	public Requerimiento addRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().add(requerimiento);
		requerimiento.setPrioridad(this);

		return requerimiento;
	}

	public Requerimiento removeRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().remove(requerimiento);
		requerimiento.setPrioridad(null);

		return requerimiento;
	}

}