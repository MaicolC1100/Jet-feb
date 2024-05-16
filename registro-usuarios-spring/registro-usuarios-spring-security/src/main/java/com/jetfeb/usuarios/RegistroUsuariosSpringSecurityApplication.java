package com.jetfeb.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jetfeb.usuarios.modelo.PersonalBll;
import com.jetfeb.usuarios.repositorio.PersonalBllRepositorio;

@SpringBootApplication
public class RegistroUsuariosSpringSecurityApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RegistroUsuariosSpringSecurityApplication.class, args);
	}

	@Autowired
	private PersonalBllRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		PersonalBll personal1 = new PersonalBll("1234190100","Maicol Cifuentes","Comercial","01651651");
		repositorio.save(personal1);
		
		PersonalBll personal2 = new PersonalBll("668630622","Darlin Aguirre","Administradora","5465161");
		repositorio.save(personal2);
		*/
	}

}
