package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "CONTACTO" database table.
 * 
 */
@Entity
@Table(name="\"CONTACTO\"")
@NamedQuery(name="Contacto.findAll", query="SELECT c FROM Contacto c")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_CONTACTO\"")
	private Integer idContacto;

	@Column(name="\"APEMAT_CONTACTO\"")
	private String apematContacto;

	@Column(name="\"APEPAT_CONTACTO\"")
	private String apepatContacto;

	@Column(name="\"DIRECCION_CONTACTO\"")
	private String direccionContacto;

	@Temporal(TemporalType.DATE)
	@Column(name="\"FECHA_NACIMIENTO\"")
	private Date fechaNacimiento;

	@Column(name="\"GENERO\"")
	private String genero;

	@Column(name="\"NOMBRES_CONTACTO\"")
	private String nombresContacto;

	@Column(name="\"TELEFONO_CONTACTO\"")
	private String telefonoContacto;

	//bi-directional many-to-one association to Clientecontacto
	@OneToMany(mappedBy="contacto")
	private List<Clientecontacto> clientecontactos;

	public Contacto() {
	}

	public Integer getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public String getApematContacto() {
		return this.apematContacto;
	}

	public void setApematContacto(String apematContacto) {
		this.apematContacto = apematContacto;
	}

	public String getApepatContacto() {
		return this.apepatContacto;
	}

	public void setApepatContacto(String apepatContacto) {
		this.apepatContacto = apepatContacto;
	}

	public String getDireccionContacto() {
		return this.direccionContacto;
	}

	public void setDireccionContacto(String direccionContacto) {
		this.direccionContacto = direccionContacto;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombresContacto() {
		return this.nombresContacto;
	}

	public void setNombresContacto(String nombresContacto) {
		this.nombresContacto = nombresContacto;
	}

	public String getTelefonoContacto() {
		return this.telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public List<Clientecontacto> getClientecontactos() {
		return this.clientecontactos;
	}

	public void setClientecontactos(List<Clientecontacto> clientecontactos) {
		this.clientecontactos = clientecontactos;
	}

	public Clientecontacto addClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().add(clientecontacto);
		clientecontacto.setContacto(this);

		return clientecontacto;
	}

	public Clientecontacto removeClientecontacto(Clientecontacto clientecontacto) {
		getClientecontactos().remove(clientecontacto);
		clientecontacto.setContacto(null);

		return clientecontacto;
	}

}