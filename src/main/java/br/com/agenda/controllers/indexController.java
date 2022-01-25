package br.com.agenda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.models.Login;

@Controller
public class indexController {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/home/index");
		mv.addObject("login",new Login());
		return mv;
	}
	

}
