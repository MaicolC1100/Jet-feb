package com.jetfeb.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jetfeb.usuarios.modelo.PersonalBll;

@Repository
public interface PersonalBllRepositorio extends JpaRepository<PersonalBll , Long> {

	
	
	
}
