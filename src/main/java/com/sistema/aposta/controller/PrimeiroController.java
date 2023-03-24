package com.sistema.aposta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class PrimeiroController {
	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
