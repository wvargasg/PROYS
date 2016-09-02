package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "GIRONEGOCIO" database table.
 * 
 */
@Entity
@Table(name="\"GIRONEGOCIO\"")
@NamedQuery(name="Gironegocio.findAll", query="SELECT g FROM Gironegocio g")
public class Gironegocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_GIRONEGOCIO\"")
	private Integer idGironegocio;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_GIRONEG\"")
	private Integer estadoGironeg;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="gironegocio")
	private List<Cliente> clientes;

	public Gironegocio() {
	}

	public Integer getIdGironegocio() {
		return this.idGironegocio;
	}

	public void setIdGironegocio(Integer idGironegocio) {
		this.idGironegocio = idGironegocio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoGironeg() {
		return this.estadoGironeg;
	}

	public void setEstadoGironeg(Integer estadoGironeg) {
		this.estadoGironeg = estadoGironeg;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setGironegocio(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setGironegocio(null);

		return cliente;
	}

}