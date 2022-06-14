package br.mil.mar.amrj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//O retorto de uma String irá retornar uma tela
	@RequestMapping(value="home", method=RequestMethod.GET)
	public String home() {
		System.out.println("ok");
		return "ok";
	}
	
	@RequestMapping(value="teladados", method=RequestMethod.GET)
	public String telaDeDados() {
		return "tela";
	}
	
	@RequestMapping(value="json", method=RequestMethod.POST)
	public ResponseEntity<String> returnJson() {
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}
}
