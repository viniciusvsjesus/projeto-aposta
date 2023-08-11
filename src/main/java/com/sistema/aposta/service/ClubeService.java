package com.sistema.aposta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.aposta.model.Clube;
import com.sistema.aposta.repository.ClubeRepository;

@Service
public class ClubeService {
	@Autowired
	private ClubeRepository repository;

	public List<Clube> buscarTodos() {
		return (List<Clube>) repository.findAll();
	}

	public Clube buscarPeloid(Long clubeId) {
		return repository.findById(clubeId).orElse(null);

	}
}
