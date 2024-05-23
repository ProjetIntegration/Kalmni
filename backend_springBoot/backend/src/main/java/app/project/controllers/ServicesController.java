package app.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.PayloadService;
import app.project.entities.Services;
import app.project.services.ServiceImp;

@RestController
public class ServicesController {

	@Autowired
	ServiceImp servicesimp ; 
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/AddService")
	public Services saveSerice(@RequestBody PayloadService s) {
		
	    return servicesimp.saveService(s);
	}
	

	
	
}
