package br.edu.infnet.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
//public class NameApplication implements CommandLineRunner{
public class NameApplication{
	
	@Autowired
	private PessoaService pessoaService;

	public static void main(String[] args) {
		SpringApplication.run(NameApplication.class, args);
	}
	
	@RequestMapping("/")
    public String greeting(ModelMap model) {
        model.addAttribute("greeting", pessoaService.busca());
        return "home";
    }

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(pessoaService.busca());
//	}
}
