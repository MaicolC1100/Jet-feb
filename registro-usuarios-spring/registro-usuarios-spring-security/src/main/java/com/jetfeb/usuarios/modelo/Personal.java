package com.jetfeb.usuarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 50, unique = true)
    private String nombre;
    
    @Column(name = "cedula", nullable = false, length = 50, unique = true)
    private String cedula;
    
    @Column(name = "placa", nullable = false, length = 50)
    private String placa;
    
    @Column(name = "cargo", nullable = false, length = 50)
    private String cargo;
    
    @Column(name = "celular", nullable = false, length = 50)
    private String celular;
    
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    public Personal() {
    }
    
    public Personal(Long id, String nombre, String cedula, String placa, String cargo, String celular, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
        this.cargo = cargo;
        this.celular = celular;
        this.correo = correo;
    }
    
    public Personal(String nombre, String cedula, String placa, String cargo, String celular, String correo) {
    	this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
        this.cargo = cargo;
        this.celular = celular;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personal [id=" + id + ", cedula=" + cedula + ", placa=" + placa + ", cargo=" + cargo 
                + ", celular=" + celular + ", correo=" + correo + "]";
    }
}
