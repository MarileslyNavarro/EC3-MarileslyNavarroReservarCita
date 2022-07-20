package com.idat.ec3MarileslyNavarroReservarCitaPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec3MarileslyNavarroReservarCitaPrueba.model.UsuarioCliente;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer> {
	UsuarioCliente findByUsuario(String usuario);
}
