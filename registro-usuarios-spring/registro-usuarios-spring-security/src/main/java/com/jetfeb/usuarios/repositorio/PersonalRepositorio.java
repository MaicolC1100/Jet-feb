package com.jetfeb.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jetfeb.usuarios.modelo.Personal;

@Repository
public interface PersonalRepositorio extends JpaRepository<Personal, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario
}