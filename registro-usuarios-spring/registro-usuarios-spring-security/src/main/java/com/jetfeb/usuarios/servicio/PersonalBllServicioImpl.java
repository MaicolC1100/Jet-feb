package com.jetfeb.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetfeb.usuarios.modelo.PersonalBll;
import com.jetfeb.usuarios.repositorio.PersonalBllRepositorio;

@Service
public class PersonalBllServicioImpl implements PersonalBllServicio { 
	
	@Autowired
	private PersonalBllRepositorio repositorio;
	
    @Override
    public List<PersonalBll> listarTodoElPersonal() {
        return repositorio.findAll();
    }

	@Override
	public PersonalBll guardarPersonalBl(PersonalBll personalbll) {
		return repositorio.save(personalbll);
	}

	@Override
	public PersonalBll obtenerPersonalBllporId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public PersonalBll actualizarPersonalBll(PersonalBll personalbll) {
		return repositorio.save(personalbll);
	}

	@Override
	public void eliminarPersonalBll(Long id) {
		repositorio.deleteById(id);
	}

}
