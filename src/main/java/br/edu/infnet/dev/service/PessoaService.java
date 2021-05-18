package br.edu.infnet.dev.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.dev.models.Pessoa;

@FeignClient(url = "https://api.agify.io/", name = "PessoaService")
public interface PessoaService {


//	@GetMapping("/?name={name}")
//	String buscaNome(@PathVariable("name") String name);
	
	@GetMapping("/?name={name}")
	Pessoa buscaNome(@PathVariable("name") String name);
	
	@GetMapping("/?name=Maria")
	Pessoa buscaMaria();
}
