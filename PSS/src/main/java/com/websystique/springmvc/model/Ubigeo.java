package com.websystique.springmvc.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "UBIGEO" database table.
 * 
 */
@Entity
@Table(name="\"UBIGEO\"")
@NamedQuery(name="Ubigeo.findAll", query="SELECT u FROM Ubigeo u")
public class Ubigeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"COD_UBIGEO\"")
	private String codUbigeo;

	@Column(name="\"COD_DEPARTAMENTO\"")
	private String codDepartamento;

	@Column(name="\"COD_DISTRITO\"")
	private String codDistrito;

	@Column(name="\"COD_PROVINCIA\"")
	private String codProvincia;

	@Column(name="\"DESCRIPCION\"")
	private String descripcion;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="ubigeo1")
	private List<Persona> personas1;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="ubigeo2")
	private List<Persona> personas2;

	public Ubigeo() {
	}

	public String getCodUbigeo() {
		return this.codUbigeo;
	}

	public void setCodUbigeo(String codUbigeo) {
		this.codUbigeo = codUbigeo;
	}

	public String getCodDepartamento() {
		return this.codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getCodDistrito() {
		return this.codDistrito;
	}

	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
	}

	public String getCodProvincia() {
		return this.codProvincia;
	}

	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Persona> getPersonas1() {
		return this.personas1;
	}

	public void setPersonas1(List<Persona> personas1) {
		this.personas1 = personas1;
	}

	public Persona addPersonas1(Persona personas1) {
		getPersonas1().add(personas1);
		personas1.setUbigeo1(this);

		return personas1;
	}

	public Persona removePersonas1(Persona personas1) {
		getPersonas1().remove(personas1);
		personas1.setUbigeo1(null);

		return personas1;
	}

	public List<Persona> getPersonas2() {
		return this.personas2;
	}

	public void setPersonas2(List<Persona> personas2) {
		this.personas2 = personas2;
	}

	public Persona addPersonas2(Persona personas2) {
		getPersonas2().add(personas2);
		personas2.setUbigeo2(this);

		return personas2;
	}

	public Persona removePersonas2(Persona personas2) {
		getPersonas2().remove(personas2);
		personas2.setUbigeo2(null);

		return personas2;
	}

}