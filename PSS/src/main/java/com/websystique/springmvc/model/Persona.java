package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "PERSONA" database table.
 * 
 */
@Entity
@Table(name="\"PERSONA\"")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_PERSONA\"")
	private Integer idPersona;

	@Column(name="\"APEMAT_PERSONA\"")
	private String apematPersona;

	@Column(name="\"APEPAT_PERSONA\"")
	private String apepatPersona;

	@Column(name="\"CANTIDAD_HIJOS\"")
	private Integer cantidadHijos;

	@Column(name="\"CORREO_PERSONA\"")
	private String correoPersona;

	@Column(name="\"DIRECCION_PERSONA\"")
	private String direccionPersona;

	@Temporal(TemporalType.DATE)
	@Column(name="\"FECHA_NACIMIENTO\"")
	private Date fechaNacimiento;

	@Column(name="\"GENERO\"")
	private String genero;

	@Column(name="\"ID_ESTADOCIVIL\"")
	private Integer idEstadocivil;

	@Column(name="\"ID_TIPODOCUMENTO\"")
	private Integer idTipodocumento;

	@Column(name="\"LUGARNACIMIENTO\"")
	private String lugarnacimiento;

	@Column(name="\"NOMBRES_PERSONA\"")
	private String nombresPersona;

	@Column(name="\"NUMERO_DOCUMENTO\"")
	private String numeroDocumento;

	@Column(name="\"TELEFONO_PERSONA\"")
	private String telefonoPersona;

	@Column(name="\"UBIGEO_DIRECCION\"")
	private String ubigeoDireccion;

	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="persona")
	private List<Empleado> empleados;

	//bi-directional many-to-one association to Estadocivil
	@ManyToOne
	@JoinColumns({
		})
	private Estadocivil estadocivil;

	//bi-directional many-to-one association to Tipodocumento
	@ManyToOne
	@JoinColumns({
		})
	private Tipodocumento tipodocumento;

	//bi-directional many-to-one association to Ubigeo
	@ManyToOne
	@JoinColumns({
		})
	private Ubigeo ubigeo1;

	//bi-directional many-to-one association to Ubigeo
	@ManyToOne
	@JoinColumns({
		})
	private Ubigeo ubigeo2;

	//bi-directional many-to-one association to Postulante
	@OneToMany(mappedBy="persona")
	private List<Postulante> postulantes;

	//bi-directional many-to-one association to Telefono
	@OneToMany(mappedBy="persona")
	private List<Telefono> telefonos;

	public Persona() {
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getApematPersona() {
		return this.apematPersona;
	}

	public void setApematPersona(String apematPersona) {
		this.apematPersona = apematPersona;
	}

	public String getApepatPersona() {
		return this.apepatPersona;
	}

	public void setApepatPersona(String apepatPersona) {
		this.apepatPersona = apepatPersona;
	}

	public Integer getCantidadHijos() {
		return this.cantidadHijos;
	}

	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public String getCorreoPersona() {
		return this.correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}

	public String getDireccionPersona() {
		return this.direccionPersona;
	}

	public void setDireccionPersona(String direccionPersona) {
		this.direccionPersona = direccionPersona;
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

	public Integer getIdEstadocivil() {
		return this.idEstadocivil;
	}

	public void setIdEstadocivil(Integer idEstadocivil) {
		this.idEstadocivil = idEstadocivil;
	}

	public Integer getIdTipodocumento() {
		return this.idTipodocumento;
	}

	public void setIdTipodocumento(Integer idTipodocumento) {
		this.idTipodocumento = idTipodocumento;
	}

	public String getLugarnacimiento() {
		return this.lugarnacimiento;
	}

	public void setLugarnacimiento(String lugarnacimiento) {
		this.lugarnacimiento = lugarnacimiento;
	}

	public String getNombresPersona() {
		return this.nombresPersona;
	}

	public void setNombresPersona(String nombresPersona) {
		this.nombresPersona = nombresPersona;
	}

	public String getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTelefonoPersona() {
		return this.telefonoPersona;
	}

	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public String getUbigeoDireccion() {
		return this.ubigeoDireccion;
	}

	public void setUbigeoDireccion(String ubigeoDireccion) {
		this.ubigeoDireccion = ubigeoDireccion;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setPersona(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setPersona(null);

		return empleado;
	}

	public Estadocivil getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(Estadocivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Tipodocumento getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(Tipodocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public Ubigeo getUbigeo1() {
		return this.ubigeo1;
	}

	public void setUbigeo1(Ubigeo ubigeo1) {
		this.ubigeo1 = ubigeo1;
	}

	public Ubigeo getUbigeo2() {
		return this.ubigeo2;
	}

	public void setUbigeo2(Ubigeo ubigeo2) {
		this.ubigeo2 = ubigeo2;
	}

	public List<Postulante> getPostulantes() {
		return this.postulantes;
	}

	public void setPostulantes(List<Postulante> postulantes) {
		this.postulantes = postulantes;
	}

	public Postulante addPostulante(Postulante postulante) {
		getPostulantes().add(postulante);
		postulante.setPersona(this);

		return postulante;
	}

	public Postulante removePostulante(Postulante postulante) {
		getPostulantes().remove(postulante);
		postulante.setPersona(null);

		return postulante;
	}

	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Telefono addTelefono(Telefono telefono) {
		getTelefonos().add(telefono);
		telefono.setPersona(this);

		return telefono;
	}

	public Telefono removeTelefono(Telefono telefono) {
		getTelefonos().remove(telefono);
		telefono.setPersona(null);

		return telefono;
	}

}