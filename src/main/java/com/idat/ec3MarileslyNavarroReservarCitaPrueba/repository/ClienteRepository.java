package com.idat.ec3MarileslyNavarroReservarCitaPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.ec3MarileslyNavarroReservarCitaPrueba.model.Cliente;

@RepositoryRestResource(path = "cliente")
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
