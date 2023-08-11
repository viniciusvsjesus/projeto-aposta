package com.sistema.aposta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.aposta.model.Country;
import com.sistema.aposta.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {
	@Autowired
	private CountryRepository repository;

	@GetMapping
	public ResponseEntity<List<Country>> listar() {
		List<Country> lista = (List<Country>) repository.findAll();
		if (lista != null) {
			return ResponseEntity.ok().body(lista);
		}
		return ResponseEntity.notFound().build();
	}
}
