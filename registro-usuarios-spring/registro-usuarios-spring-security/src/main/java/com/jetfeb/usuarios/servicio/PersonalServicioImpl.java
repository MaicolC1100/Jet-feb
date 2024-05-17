package com.jetfeb.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetfeb.usuarios.modelo.Personal;
import com.jetfeb.usuarios.repositorio.PersonalRepositorio;

@Service
public class PersonalServicioImpl implements PersonalServicio { 
	
	@Autowired
	private PersonalRepositorio repositorio;
	
    @Override
    public List<Personal> listarTodoElPersonal() {
        return repositorio.findAll();
    }

	@Override
	public Personal guardarPersonalBl(Personal personalbll) {
		return repositorio.save(personalbll);
	}

	@Override
	public Personal obtenerPersonalporId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Personal actualizarPersonal(Personal personalbll) {
		return repositorio.save(personalbll);
	}

	@Override
	public void eliminarPersonalBll(Long id) {
		repositorio.deleteById(id);
	}

}
