package app.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Personne;
import app.project.services.PersonneServiceImp;
import lombok.RequiredArgsConstructor;

import java.lang.Long;
@RestController
@RequiredArgsConstructor
@RequestMapping("/Personne")
public class PersonController {

	@Autowired
	PersonneServiceImp PersonneService; 

	
	   @Autowired
	    private AuthenticationManager authenticationManager;

	    @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	
	@GetMapping("/{id}")
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
	   @PostMapping("/signup")
	    public Personne signUp(@RequestBody Personne person) {
	        person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
	        return PersonneService.CreatePersonne(person);
	    }
	   @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password) {
	        try {
	            Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(username, password)
	            );
	            return "Login successful!";
	        } catch (AuthenticationException e) {
	            return "Login failed: " + e.getMessage();
	        }
	    }
	
}
