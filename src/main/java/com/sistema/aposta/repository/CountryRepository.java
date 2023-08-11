package com.sistema.aposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.aposta.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
