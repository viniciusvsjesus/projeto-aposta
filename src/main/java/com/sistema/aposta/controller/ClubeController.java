package com.sistema.aposta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.aposta.model.Clube;
import com.sistema.aposta.repository.ClubeRepository;

@RestController
@RequestMapping(value = "/clubes")
public class ClubeController {
	@Autowired
	private ClubeRepository clubeRepository;

	@GetMapping
	public ResponseEntity<List<Clube>> listarTodos() {
		List<Clube> lista = (List<Clube>) clubeRepository.findAll();
		if (lista != null) {
			return ResponseEntity.ok().body(lista);
		}
		return ResponseEntity.badRequest().build();
	}
}
