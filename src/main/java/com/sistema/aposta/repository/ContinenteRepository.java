package com.sistema.aposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.aposta.model.Continente;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Long> {

}
