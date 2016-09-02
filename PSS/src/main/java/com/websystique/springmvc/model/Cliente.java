package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "CLIENTE" database table.
 * 
 */
@Entity
@Table(name="\"CLIENTE\"")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_CLIENTE\"")
	private Integer idCliente;

	@Column(name="\"DIRECCION_CLIENTE\"")
	private String direccionCliente;

	@Column(name="\"ID_GIRONEGOCIO\"")
	private Integer idGironegocio;

	@Column(name="\"RAZSOC_CLIENTE\"")
	private String razsocCliente;

	@Column(name="\"RUC_CLIENTE\"")
	private String rucCliente;

	@Column(name="\"TELEFONO_CLIENTE\"")
	private String telefonoCliente;

	@Column(name="\"WEB_CLIENTE\"")
	private String webCliente;

	//bi-directional many-to-one association to Gironegocio
	@ManyToOne
	@JoinColumns({
		})
	private Gironegocio gironegocio;

	//bi-directional many-to-one association to Clientecontacto
	@OneToMany(mappedBy="cliente")
	private List<Clientecontacto> clientecontactos;

	//bi-directional many-to-one association to Servicio
	@OneToMany(mappedBy="cliente")
	private List<Servicio> servicios;

	public Cliente() {
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getDireccionCliente() {
		return this.direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public Integer getIdGironegocio() {
		return this.idGironegocio;
	}

	public void setIdGironegocio(Integer idGironegocio) {
		this.idGironegocio = idGironegocio;
	}

	public String getRazsocCliente() {
		return this.razsocCliente;
	}

	public void setRazsocCliente(String razsocCliente) {
		this.razsocCliente = razsocCliente;
	}

	public String getRucCliente() {
		return this.rucCliente;
	}

	public void setRucCliente(String rucCliente) {
		this.rucCliente = rucCliente;
	}

	public String getTelefonoCliente() {
		return this.telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getWebCliente() {
		return this.webCliente;
	}

	public void setWebCliente(String webCliente) {
		this.webCliente = webCliente;
	}

	public Gironegocio getGironegocio() {
		return this.gironegocio;
	}

	public void setGironegocio(Gironegocio gironegocio) {
		this.gironegocio = gironegocio;
	}

	public List<Clientecontacto> getClientecontactos() {
		return this.clientecontactos;
	}

	public void setClientecontactos(List<Clientecontacto> clientecontactos) {
		this.clientecontactos = clientecontactos;
	}

	public Clientecontacto addClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().add(clientecontacto);
		clientecontacto.setCliente(this);

		return clientecontacto;
	}

	public Clientecontacto removeClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().remove(clientecontacto);
		clientecontacto.setCliente(null);

		return clientecontacto;
	}

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio addServicio(Servicio servicio) {
		getServicios().add(servicio);
		servicio.setCliente(this);

		return servicio;
	}

	public Servicio removeServicio(Servicio servicio) {
		getServicios().remove(servicio);
		servicio.setCliente(null);

		return servicio;
	}

}