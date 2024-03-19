package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	
		@GetMapping
		public String helloWorld() {
			return "Hello World!!!";
		}

@GetMapping("/bsms")
public String bsms() {
	return "BSM’s Generation Brasil\n"
			+ "<br>🔹Mentalidade de Crescimento"
			+ "<br>🔹Orientação ao Futuro"
			+ "<br>🔹Responsabilidade Pessoal"
			+ "<br>🔹Persistência"
			+ "<br>🔹Trabalho em Equipe"
			+ "<br>🔹Comunicação"
			+ "<br>🔹Proatividade"
			+ "<br>🔹Orientação ao Detalhe";
}

@GetMapping("/objetivos")
public String objetivosAprendizagem() {
	return "objetivos de aprendizagem\n"
			+ "<br> Me aprfundar mais em spring boot"
			+ "<br> Melhorar meu sono"
			+ "<br> Praticar mais meu desenvolvimento em Java";
}
}