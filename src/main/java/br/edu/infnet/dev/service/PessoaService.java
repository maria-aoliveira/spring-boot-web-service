package br.edu.infnet.dev.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://api.agify.io/", name = "PessoaService")
public interface PessoaService {


	@GetMapping("/?name=Maria")
	String busca();
}
