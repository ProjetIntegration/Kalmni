package app.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping("/Recherche")
	public List<Services> rechercheService(@RequestParam("nom") String nom, @RequestParam("adresse") String adresse) {
	    List<Services> services;

        if (adresse == null && nom != null) {
            services = servicesimp.findByNomContaining(nom);
        } else if (adresse != null && nom == null) {
            services = servicesimp.findByAddresseContaining(adresse);
        } else {
            services = servicesimp.FindServicesByLocation(nom, adresse);

        }

        return services;
	}
	
	@GetMapping("/getAllServices")
	public List<Services> getAllServices() {
	    return servicesimp.findAllServices();
	}
	@GetMapping("/getServicesByNom")
	public List<Services> getServicesByNom(@RequestParam("nom") String nom) {
	    return servicesimp.findByNomContaining(nom);
	}


	
	

	
	
}
