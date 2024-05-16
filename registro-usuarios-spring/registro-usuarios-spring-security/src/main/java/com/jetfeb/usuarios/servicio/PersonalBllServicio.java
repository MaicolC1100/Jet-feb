package com.jetfeb.usuarios.servicio;

import java.util.List;

import com.jetfeb.usuarios.modelo.PersonalBll ;

public interface PersonalBllServicio {

	public List<PersonalBll> listarTodoElPersonal();
	
	public PersonalBll guardarPersonalBl(PersonalBll personalbll);
	
	public PersonalBll obtenerPersonalBllporId(Long id);
	
	public PersonalBll actualizarPersonalBll(PersonalBll personalbll);
	
	public void eliminarPersonalBll(Long id);
	
}
