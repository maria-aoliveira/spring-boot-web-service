package br.edu.infnet.dev;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Headers;

@FeignClient(url = "https://api.agify.io/", name = "PessoaService")
public interface PessoaService {


	@GetMapping("/?name=Maria")
	String busca();
}
