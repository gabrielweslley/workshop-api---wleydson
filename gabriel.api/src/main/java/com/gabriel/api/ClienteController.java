package com.gabriel.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping("/{nome}")
	public String hello(@PathVariable() String nome) {
		return "ola".concat(nome);
	}
	
	@GetMapping()
	public String hello() {
		return "ola";
	}
}
