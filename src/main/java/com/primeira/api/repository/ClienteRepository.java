package com.primeira.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primeira.api.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
