package app.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Services;
import app.project.services.ServiceImp;

@RestController
public class ServicesController {

	@Autowired
	ServiceImp servicesimp ; 
	
	
	@PostMapping("/Services")
	public Services saveSerice(@RequestBody Services s, @RequestParam Long cat, @RequestParam Long p) {
		
	    return servicesimp.saveService(s, cat, p);
	}

	
	
}
