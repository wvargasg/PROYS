package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "SERVICIO" database table.
 * 
 */
@Entity
@Table(name="\"SERVICIO\"")
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_SERVICIO\"")
	private Integer idServicio;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="\"FECHA_FIN\"")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="\"FECHA_INICIO\"")
	private Date fechaInicio;

	@Column(name="\"ID_CLIENTE\"")
	private Integer idCliente;

	@Column(name="\"ID_TIPOMONEDA\"")
	private Integer idTipomoneda;

	@Column(name="\"ID_TIPOSERVICIO\"")
	private Integer idTiposervicio;

	@Column(name="\"MONTO\"")
	private BigDecimal monto;

	//bi-directional many-to-one association to Requerimiento
	@OneToMany(mappedBy="servicio")
	private List<Requerimiento> requerimientos;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumns({
		})
	private Cliente cliente;

	//bi-directional many-to-one association to Tipomoneda
	@ManyToOne
	@JoinColumns({
		})
	private Tipomoneda tipomoneda;

	//bi-directional many-to-one association to Tiposervicio
	@ManyToOne
	@JoinColumns({
		})
	private Tiposervicio tiposervicio;

	public Servicio() {
	}

	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdTipomoneda() {
		return this.idTipomoneda;
	}

	public void setIdTipomoneda(Integer idTipomoneda) {
		this.idTipomoneda = idTipomoneda;
	}

	public Integer getIdTiposervicio() {
		return this.idTiposervicio;
	}

	public void setIdTiposervicio(Integer idTiposervicio) {
		this.idTiposervicio = idTiposervicio;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public List<Requerimiento> getRequerimientos() {
		return this.requerimientos;
	}

	public void setRequerimientos(List<Requerimiento> requerimientos) {
		this.requerimientos = requerimientos;
	}

	public Requerimiento addRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().add(requerimiento);
		requerimiento.setServicio(this);

		return requerimiento;
	}

	public Requerimiento removeRequerimiento(Requerimiento requerimiento) {
		getRequerimientos().remove(requerimiento);
		requerimiento.setServicio(null);

		return requerimiento;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Tipomoneda getTipomoneda() {
		return this.tipomoneda;
	}

	public void setTipomoneda(Tipomoneda tipomoneda) {
		this.tipomoneda = tipomoneda;
	}

	public Tiposervicio getTiposervicio() {
		return this.tiposervicio;
	}

	public void setTiposervicio(Tiposervicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

}