package br.edu.infnet.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.dev.models.Pessoa;
import br.edu.infnet.dev.service.PessoaService;

@Controller
public class PessoaController {
		
	@Autowired
	private PessoaService pessoaService;

	@RequestMapping("/")
    	public String greetingMaria(ModelMap model) {
	Pessoa data = pessoaService.buscaMaria();
        model.addAttribute("pessoa", data.getName());
        model.addAttribute("age", data.getAge());
        return "home";
    }
	
	@RequestMapping("/busca")
   	public String greetingName(ModelMap model, String name) {
	Pessoa data = pessoaService.buscaNome(name);
	model.addAttribute("pessoa", data.getName());
        model.addAttribute("age", data.getAge());
        return "home";
    }
}
