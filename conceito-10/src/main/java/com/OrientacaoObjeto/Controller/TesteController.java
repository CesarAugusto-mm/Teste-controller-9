package com.OrientacaoObjeto.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TesteApi")
public class TesteController {
	
	@GetMapping
	public String retornandoStringOrientacaoObjeto () {
		return "O conceito de abstração consiste em esconder os detalhes"
				+ " de algo, no caso, os detalhes desnecessários. Dessa forma,"
				+ " todos os outros pilares serão desenvolvidos a partir da Abstração.";
	}
	
	@GetMapping("/1")
	/*buscar tudo*/
	public String retornandoStringHeranca () {
	return "A Herança possibilita que as classes compartilhem seus atributos, métodos e"
			+ " outros membros da classe entre si. Para a ligação entre as classes, a herança"
			+ " adota um relacionamento esquematizado hierarquicamente.";
	}
	
	@PostMapping
	/*Criar um recurso*/
	public String post (@RequestBody String texto) {	
	System.out.println(texto);	
	return texto;

	}
	
	@PutMapping
	/*Atualizar recurso*/
	public String put (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@PatchMapping
	/*Fazer a alteração de valores específicos de um recurso*/
	public String patch (@RequestBody String texto) {
		System.out.println(texto);
		return texto;
	}
	
	@DeleteMapping
	/*Remoção recurso*/
	public String deletado () {
		return "deleta alguma coisa pelo amor!!!";
	}

}
