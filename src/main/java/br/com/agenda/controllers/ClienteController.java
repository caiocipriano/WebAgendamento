package br.com.agenda.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.models.Agenda;
import br.com.agenda.repository.AgendaDAO;

@Controller
public class ClienteController {
		
	@Autowired
	private AgendaDAO agendaRepository;
		
	@GetMapping("/agendamento")
	public ModelAndView agendar() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cliente/agendamento");
		mv.addObject("agenda", new Agenda());
		return mv;
	}
	
	@PostMapping("/agendar")
	public ModelAndView agendamento(@Valid Agenda agenda, BindingResult br) {
		ModelAndView mv = new ModelAndView();
		if(br.hasErrors()) {
			mv.setViewName("Cliente/agendamento");
			mv.addObject(agenda);
		}else{
			mv.setViewName("/home/index");
			agendaRepository.save(agenda);
		}
		
		return mv;
	}
	
	@GetMapping("/listAgenda")
	public ModelAndView listAgenda() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cliente/listAgenda");
		mv.addObject("listAgenda", agendaRepository.findAll());
		return mv;
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Integer id) {
		agendaRepository.deleteById(id);
		return"redirect:/listAgenda";
	}
	
	
	
}
