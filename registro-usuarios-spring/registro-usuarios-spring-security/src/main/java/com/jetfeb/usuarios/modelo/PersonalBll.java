package com.jetfeb.usuarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "personalBll")
public class PersonalBll {
//ID CC NOMBRE GERENCIA CTRO_COSTO-->

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name =  "cedula", nullable = false, length = 50, unique = true)
	private String cedula;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name =  "Gerencia", nullable = false, length = 50)
	private String Gerencia;
	
	@Column(name =  "Ctro_costo", nullable = false, length = 50)
	private String Ctro_costo;

	public PersonalBll(){
		
	}
	
	public PersonalBll(Long id, String cedula, String nombre, String gerencia, String ctro_costo) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombre = nombre;
		Gerencia = gerencia;
		Ctro_costo = ctro_costo;
	}
	

	public PersonalBll(String cedula, String nombre, String gerencia, String ctro_costo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		Gerencia = gerencia;
		Ctro_costo = ctro_costo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGerencia() {
		return Gerencia;
	}

	public void setGerencia(String gerencia) {
		Gerencia = gerencia;
	}

	public String getCtro_costo() {
		return Ctro_costo;
	}

	public void setCtro_costo(String ctro_costo) {
		Ctro_costo = ctro_costo;
	}

	@Override
	public String toString() {
		return "PersonalBll [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", Gerencia=" + Gerencia
				+ ", Ctro_costo=" + Ctro_costo + "]";
	}
	
	
	
}

