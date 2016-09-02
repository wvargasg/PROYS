package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "ESTADOREQUERIMIENTO" database table.
 * 
 */
@Entity
@Table(name="\"ESTADOREQUERIMIENTO\"")
@NamedQuery(name="Estadorequerimiento.findAll", query="SELECT e FROM Estadorequerimiento e")
public class Estadorequerimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_ESTADOREQUERIMIENTO\"")
	private Integer idEstadorequerimiento;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO\"")
	private Integer estado;

	//bi-directional many-to-one association to Requerimiento
	@OneToMany(mappedBy="estadorequerimiento")
	private List<Requerimiento> requerimientos;

	public Estadorequerimiento() {
	}

	public Integer getIdEstadorequerimiento() {
		return this.idEstadorequerimiento;
	}

	public void setIdEstadorequerimiento(Integer idEstadorequerimiento) {
		this.idEstadorequerimiento = idEstadorequerimiento;
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

	public List<Requerimiento> getRequerimientos() {
		return this.requerimientos;
	}

	public void setRequerimientos(List<Requerimiento> requerimientos) {
		this.requerimientos = requerimientos;
	}

	public Requerimiento addRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().add(requerimiento);
		requerimiento.setEstadorequerimiento(this);

		return requerimiento;
	}

	public Requerimiento removeRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().remove(requerimiento);
		requerimiento.setEstadorequerimiento(null);

		return requerimiento;
	}

}