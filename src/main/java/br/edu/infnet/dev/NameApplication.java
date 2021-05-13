package br.edu.infnet.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NameApplication implements CommandLineRunner{
	
	@Autowired
	private PessoaService pessoaService;

	public static void main(String[] args) {
		SpringApplication.run(NameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(pessoaService.busca("Maria"));
	}
}
