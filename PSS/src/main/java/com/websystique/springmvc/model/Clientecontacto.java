package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "CLIENTECONTACTO" database table.
 * 
 */
@Entity
@Table(name="\"CLIENTECONTACTO\"")
@NamedQuery(name="Clientecontacto.findAll", query="SELECT c FROM Clientecontacto c")
public class Clientecontacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_CLIENTECONTACTO\"")
	private Integer idClientecontacto;

	@Column(name="\"CORREO_CORPORATIVO\"")
	private String correoCorporativo;

	@Column(name="\"ID_CLIENTE\"")
	private Integer idCliente;

	@Column(name="\"ID_CONTACTO\"")
	private Integer idContacto;

	@Column(name="\"ID_TIPOCONTACTO\"")
	private Integer idTipocontacto;

	@Column(name="\"TELEFONO_CORPORATIVO\"")
	private String telefonoCorporativo;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumns({
		})
	private Cliente cliente;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumns({
		})
	private Contacto contacto;

	//bi-directional many-to-one association to Tipocontacto
	@ManyToOne
	@JoinColumns({
		})
	private Tipocontacto tipocontacto;

	public Clientecontacto() {
	}

	public Integer getIdClientecontacto() {
		return this.idClientecontacto;
	}

	public void setIdClientecontacto(Integer idClientecontacto) {
		this.idClientecontacto = idClientecontacto;
	}

	public String getCorreoCorporativo() {
		return this.correoCorporativo;
	}

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public Integer getIdTipocontacto() {
		return this.idTipocontacto;
	}

	public void setIdTipocontacto(Integer idTipocontacto) {
		this.idTipocontacto = idTipocontacto;
	}

	public String getTelefonoCorporativo() {
		return this.telefonoCorporativo;
	}

	public void setTelefonoCorporativo(String telefonoCorporativo) {
		this.telefonoCorporativo = telefonoCorporativo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Contacto getContacto() {
		return this.contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Tipocontacto getTipocontacto() {
		return this.tipocontacto;
	}

	public void setTipocontacto(Tipocontacto tipocontacto) {
		this.tipocontacto = tipocontacto;
	}

}