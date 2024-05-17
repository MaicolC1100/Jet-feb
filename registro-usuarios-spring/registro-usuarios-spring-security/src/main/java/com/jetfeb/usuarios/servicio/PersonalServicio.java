package com.jetfeb.usuarios.servicio;

import java.util.List;

import com.jetfeb.usuarios.modelo.Personal;


public interface PersonalServicio {

	public List<Personal> listarTodoElPersonal();
	
	public Personal guardarPersonalBl(Personal personal);
	
	public Personal obtenerPersonalBllporId(Long id);
	
	public Personal actualizarPersonalBll(Personal personal);
	
	public void eliminarPersonalBll(Long id);
	
}
