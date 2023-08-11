package com.sistema.aposta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.aposta.model.Clube;
import com.sistema.aposta.service.ClubeService;

@RequestMapping("/clubes")
@RestController
public class ClubeController {
	@Autowired
	private ClubeService service;

	@GetMapping
	public ResponseEntity<List<Clube>> buscarTodos() {
		List<Clube> lista = service.buscarTodos();
		if (lista != null) {
			return ResponseEntity.ok().body(lista);
		}
		return ResponseEntity.status(404).build();
	}

	@GetMapping("/{clubeId}")
	public ResponseEntity<Clube> listarPeloId(@PathVariable Long clubeId) {
		Clube clube = service.buscarPeloid(clubeId);
		if (clube != null) {
			return ResponseEntity.ok().body(clube);
		}
		return ResponseEntity.notFound().build();
	}

}
