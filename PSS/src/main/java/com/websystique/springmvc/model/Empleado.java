package com.websystique.springmvc.model;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "EMPLEADOS" database table.
 * 
 */
@Entity
@Table(name="\"EMPLEADOS\"")
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID_EMPLEADO\"")
	private Integer idEmpleado;

	@Column(name="\"ID_PERSONA\"")
	private Integer idPersona;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumns({
		})
	private Persona persona;

	public Empleado() {
	}

	public Integer getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}