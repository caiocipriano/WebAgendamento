package br.com.agenda.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.models.Agenda;

@Controller
public class ClienteController {
	
		
	@GetMapping("/agendamento")
	public ModelAndView agendar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cliente/agendamento");
		mv.addObject("agenda", new Agenda());
		return mv;
	}
	
	@PostMapping("/agendar")
	public ModelAndView agendamento(@Valid Agenda agenda) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("agenda", new Agenda());
		return mv;
	}
	
}
