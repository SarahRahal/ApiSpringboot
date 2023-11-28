package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")

public class contatoController {
// nao precisa dai usar o /contatos dentro dos mappings
	
	@GetMapping() 
	public String getContatos() {
		return "lista de contatos";
	}
	
	@GetMapping("/{idContato}") 
	public String getContatosId() {
		return "contato por id";
	}
		
	@PostMapping() 
	public ResponseEntity<String> inserirContatos(@RequestBody String contato) {
		return ResponseEntity.status(HttpStatus.CREATED).body(contato);
	}
	
	@PutMapping("/{idContato}") 
	public ResponseEntity<String> alterarContatos(@PathVariable("idContato") int id, @RequestBody String contato) {
		return ResponseEntity.status(HttpStatus.OK).body(contato);
	}
}
