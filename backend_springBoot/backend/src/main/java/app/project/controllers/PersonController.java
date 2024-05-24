package app.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Personne;
import app.project.repository.PersonneRepository;
import app.project.services.PersonneServiceImp;
import lombok.RequiredArgsConstructor;

import java.lang.Long;
@RestController
@RequiredArgsConstructor

public class PersonController {

	@Autowired
	PersonneServiceImp PersonneService; 
    @Autowired
    PersonneRepository personrepository ; 
	
	@GetMapping("/PersonneAccept")
	public ResponseEntity<?>  AcceptPersonne(@PathVariable("id") Long id)
	{
		Personne p =  personrepository.findById(id).orElse(null); 
		int accepted = 1 ;  
		p.setStatus(accepted); 
		personrepository.save(p); 
		return new ResponseEntity<>("User updtaed",HttpStatus.OK);
	}
	
	
	
	
	
	
	
	@GetMapping("/Personne/{id}")
    public Personne getPersonne(@PathVariable("id") Long id) {
        return PersonneService.GetPersonneById(id);
    }
	
	@GetMapping("/Users")
	public List<Personne> GetAll( ModelMap modelmap)
	{
		return  PersonneService.GetAllPersonnes(); 
	}
	
	@DeleteMapping("/UserDel/{id}")
	public void DeletePersonne(@PathVariable ("id") Long id,ModelMap modelmap)
	{
		PersonneService.DeletePersonneById(id); 
	}
	
	@PutMapping("/UserUpdate")
	public void UpdateUser(@RequestBody Personne person )
	{
		PersonneService.UpdatePersonne(person); 
	}
	
}
