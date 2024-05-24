package app.project.services;

import java.util.List;

import app.project.entities.Personne;

public interface PersonneService {

	public Personne GetPersonneById(Long id ); 
	public List<Personne> GetAllPersonnes(); 
	public Personne  CreatePersonne(Personne p); 
	public void DeletePersonneById(Long id ); 
	public void DeletePersonne(Personne p); 
	public Personne UpdatePersonne(Personne p); 
    Personne findPersonById(Long id);

}
