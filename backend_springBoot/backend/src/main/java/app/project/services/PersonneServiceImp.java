package app.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Personne;
import app.project.entities.Services;
import app.project.repository.PersonneRepository;
import app.project.repository.ServiceRepository;

@Service
public class PersonneServiceImp  implements PersonneService{

	@Autowired
	
	PersonneRepository personneRepository ;
	ServiceRepository servicerepository ; 


	@Override
	public Personne GetPersonneById(Long id) {
	  return  personneRepository.findById(id).get();
	     // or handle the case when personne is not found
	}
	
	public List<Services>GetServicesOwner(Long id )
	{
	Personne  p =  personneRepository.findById(id).get(); 
	List<Services> s = p.getServices(); 
	return s; 
	}

	@Override
	public List<Personne> GetAllPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Personne CreatePersonne(Personne p ) {
		// TODO Auto-generated method stub
		return  personneRepository.save(p);
		
	}

	@Override
	public void DeletePersonneById(Long id) {
		// TODO Auto-generated method stub
		personneRepository.deleteById(id);
		
	}

	@Override
	public void DeletePersonne(Personne p) {
		// TODO Auto-generated method stub
		personneRepository.delete(p);
		
	}

	@Override
	public Personne UpdatePersonne(Personne p) {
		// TODO Auto-generated method stub
		return  personneRepository.save(p);
	}

	 @Override
	    public Personne findPersonById(Long id) {
	        Optional<Personne> person = personneRepository.findById(id);
	        return person.orElse(null);
	    }
	
	

}
