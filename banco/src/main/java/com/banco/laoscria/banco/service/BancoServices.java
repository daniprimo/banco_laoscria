package com.banco.laoscria.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.laoscria.banco.models.Banco;
import com.banco.laoscria.banco.repository.BancoRepository;

@Service
public class BancoServices {

	@Autowired
	private BancoRepository bancoRepository;

	public Banco criarBanco (Banco banco) {
		return bancoRepository.save(banco);
	}
	
	public List<Banco> listarBancos () {
		return bancoRepository.findAll();
	}
	
	public Banco alterarBanco (Long id, Banco banco) {
		Banco optional = bancoRepository.findById(id).get();
		banco.setId(optional.getId());
		
		return bancoRepository.save(banco);
	}
	
}
