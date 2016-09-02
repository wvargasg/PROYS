package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TIPOCONTRATACION" database table.
 * 
 */
@Entity
@Table(name="\"TIPOCONTRATACION\"")
@NamedQuery(name="Tipocontratacion.findAll", query="SELECT t FROM Tipocontratacion t")
public class Tipocontratacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPOCONTRATACION\"")
	private Integer idTipocontratacion;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPOCONTRATACION\"")
	private Integer estadoTipocontratacion;

	//bi-directional many-to-one association to Ofrecimientosalarial
	@OneToMany(mappedBy="tipocontratacion")
	private List<Ofrecimientosalarial> ofrecimientosalarials;

	//bi-directional many-to-one association to Pretensionsalarial
	@OneToMany(mappedBy="tipocontratacion")
	private List<Pretensionsalarial> pretensionsalarials;

	public Tipocontratacion() {
	}

	public Integer getIdTipocontratacion() {
		return this.idTipocontratacion;
	}

	public void setIdTipocontratacion(Integer idTipocontratacion) {
		this.idTipocontratacion = idTipocontratacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTipocontratacion() {
		return this.estadoTipocontratacion;
	}

	public void setEstadoTipocontratacion(Integer estadoTipocontratacion) {
		this.estadoTipocontratacion = estadoTipocontratacion;
	}

	public List<Ofrecimientosalarial> getOfrecimientosalarials() {
		return this.ofrecimientosalarials;
	}

	public void setOfrecimientosalarials(List<Ofrecimientosalarial> ofrecimientosalarials) {
		this.ofrecimientosalarials = ofrecimientosalarials;
	}

	public Ofrecimientosalarial addOfrecimientosalarial(Ofrecimientosalarial ofrecimientosalarial) {
		getOfrecimientosalarials().add(ofrecimientosalarial);
		ofrecimientosalarial.setTipocontratacion(this);

		return ofrecimientosalarial;
	}

	public Ofrecimientosalarial removeOfrecimientosalarial(Ofrecimientosalarial ofrecimientosalarial) {
		getOfrecimientosalarials().remove(ofrecimientosalarial);
		ofrecimientosalarial.setTipocontratacion(null);

		return ofrecimientosalarial;
	}

	public List<Pretensionsalarial> getPretensionsalarials() {
		return this.pretensionsalarials;
	}

	public void setPretensionsalarials(List<Pretensionsalarial> pretensionsalarials) {
		this.pretensionsalarials = pretensionsalarials;
	}

	public Pretensionsalarial addPretensionsalarial(Pretensionsalarial pretensionsalarial) {
		getPretensionsalarials().add(pretensionsalarial);
		pretensionsalarial.setTipocontratacion(this);

		return pretensionsalarial;
	}

	public Pretensionsalarial removePretensionsalarial(Pretensionsalarial pretensionsalarial) {
		getPretensionsalarials().remove(pretensionsalarial);
		pretensionsalarial.setTipocontratacion(null);

		return pretensionsalarial;
	}

}