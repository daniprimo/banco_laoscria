package com.banco.laoscria.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.laoscria.banco.models.Banco;
import com.banco.laoscria.banco.service.BancoServices;

@RestController
@RequestMapping("/banco")
public class BancoController {

	@Autowired
	private BancoServices bancoServices;
	
	@PostMapping
	public ResponseEntity<Banco> adicionarBanco (@RequestBody Banco banco) {
		return ResponseEntity.ok(bancoServices.criarBanco(banco));
	}
	
	@GetMapping
	public ResponseEntity<List<Banco>> buscarTodosBancos () {
		return ResponseEntity.ok(bancoServices.listarBancos());
	}
	
	
}
