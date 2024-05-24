package app.project.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.project.entities.Category;
import app.project.entities.Personne;
import app.project.entities.ServicePayLoad;
import app.project.entities.Services;
import app.project.repository.CategoryRepository;
import app.project.repository.PersonneRepository;
import app.project.repository.ServiceRepository;
import app.project.services.ServiceImp;


@RestController
public class ServicesController {
	@Autowired
    private ObjectMapper objectMapper;
	@Autowired 
	CategoryRepository categoryrepository;
	@Autowired 
	PersonneRepository personnerepository ;
	@Autowired 
	ServiceRepository servicerepository  ;

	@Autowired
	ServiceImp servicesimp ; 
	@CrossOrigin(origins = "http://localhost:8081")
	@PostMapping("/AddService")
	public ResponseEntity<?> saveService(@RequestBody ServicePayLoad s){

		Services services = new Services();
		services.setNom(s.getNom());
	    services.setDescription(s.getDescription());
	    services.setAdresse(s.getAddresse());
	    services.setHeure_debut(s.getHeure_debut());
	    services.setHeure_fin(s.getHeure_fin());
	    services.setPhoto(s.getPhoto());
	    System.out.println(s.getNom());
	    System.out.println(s.getCategoryId());
	    System.out.println(s.getPersonneId());

	    //Category p = categoryrepository.findById(s.getCategoryId()).get(); 
	    //Personne p2 = personnerepository.findById(s.getPersonneId()).get();
	    //services.setCategory(p);
	    //services.setOwner(p2);
	    servicerepository.save(services); 
	    return new ResponseEntity<>(services,HttpStatus.OK);
	    
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
