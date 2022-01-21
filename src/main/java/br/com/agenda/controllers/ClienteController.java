package br.com.agenda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {
	
	@RequestMapping("/cadastrar")
	public String cadastro() {
		return "formCliente";
		
	}
	
}
