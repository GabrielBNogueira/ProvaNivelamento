package com.nivelamento.computadores.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComputadorRepository extends CrudRepository<String, Integer> {
    List<String> findByNome(String nome);
}
