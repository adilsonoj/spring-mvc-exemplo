package br.mil.mar.amrj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.mil.mar.amrj.model.Monitor;

@Controller
public class MonitorController {

	@RequestMapping(value="telaprincipalmonitor", method = RequestMethod.GET)
	public String telaPrincipal() {
		return "telaPrincipalMonitor";
	}
	
	@RequestMapping(value="getMonitor", method = RequestMethod.GET)
	public ResponseEntity<Monitor> getMonitor(Integer id, String marca) {
		System.out.println(marca);
		Monitor monitor =  new Monitor();
		monitor.setId(1);
		monitor.setMarca("LG");
		monitor.setModelo("Flatron");
		monitor.setTamanho(21);
		monitor.setTipo("LED");
		
		
		if(monitor.getId() == id) {
			return new ResponseEntity<Monitor>(monitor, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
