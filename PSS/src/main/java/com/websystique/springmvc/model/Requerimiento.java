package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "REQUERIMIENTO" database table.
 * 
 */
@Entity
@Table(name="\"REQUERIMIENTO\"")
@NamedQuery(name="Requerimiento.findAll", query="SELECT r FROM Requerimiento r")
public class Requerimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_REQUERIMIENTO\"")
	private Integer idRequerimiento;

	@Column(name="\"CANTIDAD_ESPERADA\"")
	private Integer cantidadEsperada;

	@Column(name="\"CANTIDAD_NECESARIA\"")
	private Integer cantidadNecesaria;

	@Column(name="\"EXPERIENCIA\"")
	private String experiencia;

	@Column(name="\"FUNCIONES\"")
	private String funciones;

	@Column(name="\"HORARIO_TRABAJO\"")
	private String horarioTrabajo;

	@Column(name="\"ID_ESTADOREQUERIMIENTO\"")
	private Integer idEstadorequerimiento;

	@Column(name="\"ID_PERFIL\"")
	private Integer idPerfil;

	@Column(name="\"ID_PRIORIDAD\"")
	private Integer idPrioridad;

	@Column(name="\"ID_SERVICIO\"")
	private Integer idServicio;

	@Column(name="\"INCLUYE_MATERIAL\"")
	private Boolean incluyeMaterial;

	@Column(name="\"LICITACION\"")
	private Boolean licitacion;

	@Column(name="\"NUEVO\"")
	private Boolean nuevo;

	@Column(name="\"PERFIL_PROFESIONAL\"")
	private String perfilProfesional;

	//bi-directional many-to-one association to Ofrecimientosalarial
	@OneToMany(mappedBy="requerimiento")
	private List<Ofrecimientosalarial> ofrecimientosalarials;

	//bi-directional many-to-one association to Estadorequerimiento
	@ManyToOne
	@JoinColumns({
		})
	private Estadorequerimiento estadorequerimiento;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	@JoinColumns({
		})
	private Perfil perfil;

	//bi-directional many-to-one association to Prioridad
	@ManyToOne
	@JoinColumns({
		})
	private Prioridad prioridad;

	//bi-directional many-to-one association to Servicio
	@ManyToOne
	@JoinColumns({
		})
	private Servicio servicio;

	//bi-directional many-to-one association to Requerimientocompetencia
	@OneToMany(mappedBy="requerimiento")
	private List<Requerimientocompetencia> requerimientocompetencias;

	//bi-directional many-to-one association to Requerimientoconocimiento
	@OneToMany(mappedBy="requerimiento")
	private List<Requerimientoconocimiento> requerimientoconocimientos;

	//bi-directional many-to-one association to Requerimientopostulante
	@OneToMany(mappedBy="requerimiento")
	private List<Requerimientopostulante> requerimientopostulantes;

	public Requerimiento() {
	}

	public Integer getIdRequerimiento() {
		return this.idRequerimiento;
	}

	public void setIdRequerimiento(Integer idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public Integer getCantidadEsperada() {
		return this.cantidadEsperada;
	}

	public void setCantidadEsperada(Integer cantidadEsperada) {
		this.cantidadEsperada = cantidadEsperada;
	}

	public Integer getCantidadNecesaria() {
		return this.cantidadNecesaria;
	}

	public void setCantidadNecesaria(Integer cantidadNecesaria) {
		this.cantidadNecesaria = cantidadNecesaria;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getFunciones() {
		return this.funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public String getHorarioTrabajo() {
		return this.horarioTrabajo;
	}

	public void setHorarioTrabajo(String horarioTrabajo) {
		this.horarioTrabajo = horarioTrabajo;
	}

	public Integer getIdEstadorequerimiento() {
		return this.idEstadorequerimiento;
	}

	public void setIdEstadorequerimiento(Integer idEstadorequerimiento) {
		this.idEstadorequerimiento = idEstadorequerimiento;
	}

	public Integer getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Integer getIdPrioridad() {
		return this.idPrioridad;
	}

	public void setIdPrioridad(Integer idPrioridad) {
		this.idPrioridad = idPrioridad;
	}

	public Integer getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Boolean getIncluyeMaterial() {
		return this.incluyeMaterial;
	}

	public void setIncluyeMaterial(Boolean incluyeMaterial) {
		this.incluyeMaterial = incluyeMaterial;
	}

	public Boolean getLicitacion() {
		return this.licitacion;
	}

	public void setLicitacion(Boolean licitacion) {
		this.licitacion = licitacion;
	}

	public Boolean getNuevo() {
		return this.nuevo;
	}

	public void setNuevo(Boolean nuevo) {
		this.nuevo = nuevo;
	}

	public String getPerfilProfesional() {
		return this.perfilProfesional;
	}

	public void setPerfilProfesional(String perfilProfesional) {
		this.perfilProfesional = perfilProfesional;
	}

	public List<Ofrecimientosalarial> getOfrecimientosalarials() {
		return this.ofrecimientosalarials;
	}

	public void setOfrecimientosalarials(List<Ofrecimientosalarial> ofrecimientosalarials) {
		this.ofrecimientosalarials = ofrecimientosalarials;
	}

	public Ofrecimientosalarial addOfrecimientosalarial(Ofrecimientosalarial ofrecimientosalarial) {
		getOfrecimientosalarials().add(ofrecimientosalarial);
		ofrecimientosalarial.setRequerimiento(this);

		return ofrecimientosalarial;
	}

	public Ofrecimientosalarial removeOfrecimientosalarial(Ofrecimientosalarial ofrecimientosalarial) {
		getOfrecimientosalarials().remove(ofrecimientosalarial);
		ofrecimientosalarial.setRequerimiento(null);

		return ofrecimientosalarial;
	}

	public Estadorequerimiento getEstadorequerimiento() {
		return this.estadorequerimiento;
	}

	public void setEstadorequerimiento(Estadorequerimiento estadorequerimiento) {
		this.estadorequerimiento = estadorequerimiento;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Prioridad getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Requerimientocompetencia> getRequerimientocompetencias() {
		return this.requerimientocompetencias;
	}

	public void setRequerimientocompetencias(List<Requerimientocompetencia> requerimientocompetencias) {
		this.requerimientocompetencias = requerimientocompetencias;
	}

	public Requerimientocompetencia addRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().add(requerimientocompetencia);
		requerimientocompetencia.setRequerimiento(this);

		return requerimientocompetencia;
	}

	public Requerimientocompetencia removeRequerimientocompetencia(Requerimientocompetencia requerimientocompetencia) {
		getRequerimientocompetencias().remove(requerimientocompetencia);
		requerimientocompetencia.setRequerimiento(null);

		return requerimientocompetencia;
	}

	public List<Requerimientoconocimiento> getRequerimientoconocimientos() {
		return this.requerimientoconocimientos;
	}

	public void setRequerimientoconocimientos(List<Requerimientoconocimiento> requerimientoconocimientos) {
		this.requerimientoconocimientos = requerimientoconocimientos;
	}

	public Requerimientoconocimiento addRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().add(requerimientoconocimiento);
		requerimientoconocimiento.setRequerimiento(this);

		return requerimientoconocimiento;
	}

	public Requerimientoconocimiento removeRequerimientoconocimiento(Requerimientoconocimiento requerimientoconocimiento) {
		getRequerimientoconocimientos().remove(requerimientoconocimiento);
		requerimientoconocimiento.setRequerimiento(null);

		return requerimientoconocimiento;
	}

	public List<Requerimientopostulante> getRequerimientopostulantes() {
		return this.requerimientopostulantes;
	}

	public void setRequerimientopostulantes(List<Requerimientopostulante> requerimientopostulantes) {
		this.requerimientopostulantes = requerimientopostulantes;
	}

	public Requerimientopostulante addRequerimientopostulante(Requerimientopostulante requerimientopostulante) {
		getRequerimientopostulantes().add(requerimientopostulante);
		requerimientopostulante.setRequerimiento(this);

		return requerimientopostulante;
	}

	public Requerimientopostulante removeRequerimientopostulante(Requerimientopostulante requerimientopostulante) {
		getRequerimientopostulantes().remove(requerimientopostulante);
		requerimientopostulante.setRequerimiento(null);

		return requerimientopostulante;
	}

}