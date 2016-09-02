package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TIPOCONTACTO" database table.
 * 
 */
@Entity
@Table(name="\"TIPOCONTACTO\"")
@NamedQuery(name="Tipocontacto.findAll", query="SELECT t FROM Tipocontacto t")
public class Tipocontacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_TIPOCONTACTO\"")
	private Integer idTipocontacto;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	@Column(name="\"ESTADO_TIPOCONTACTO\"")
	private Integer estadoTipocontacto;

	//bi-directional many-to-one association to Clientecontacto
	@OneToMany(mappedBy="tipocontacto")
	private List<Clientecontacto> clientecontactos;

	public Tipocontacto() {
	}

	public Integer getIdTipocontacto() {
		return this.idTipocontacto;
	}

	public void setIdTipocontacto(Integer idTipocontacto) {
		this.idTipocontacto = idTipocontacto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstadoTipocontacto() {
		return this.estadoTipocontacto;
	}

	public void setEstadoTipocontacto(Integer estadoTipocontacto) {
		this.estadoTipocontacto = estadoTipocontacto;
	}

	public List<Clientecontacto> getClientecontactos() {
		return this.clientecontactos;
	}

	public void setClientecontactos(List<Clientecontacto> clientecontactos) {
		this.clientecontactos = clientecontactos;
	}

	public Clientecontacto addClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().add(clientecontacto);
		clientecontacto.setTipocontacto(this);

		return clientecontacto;
	}

	public Clientecontacto removeClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().remove(clientecontacto);
		clientecontacto.setTipocontacto(null);

		return clientecontacto;
	}

}