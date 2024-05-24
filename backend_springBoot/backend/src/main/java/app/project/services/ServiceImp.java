package app.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.project.entities.Category;
import app.project.entities.PayloadService;
import app.project.entities.Paylod;
import app.project.entities.Personne;
import app.project.entities.Projects;
import app.project.entities.Services;
import app.project.repository.CategoryRepository;
import app.project.repository.PersonneRepository;
import app.project.repository.ServiceRepository;



@org.springframework.stereotype.Service
public class ServiceImp  implements Service{
	@Autowired 
	ServiceRepository servicerepository  ;
	@Autowired 
	CategoryRepository categoryrepository;
	@Autowired 
	PersonneRepository personnerepository ;

	@Override
	public void deleteService(Long id) {
		// TODO Auto-generated method stub
		servicerepository.deleteById(id);		
	}

	@Override
	public Services saveService(Services s) {
	    Services services = new Services();
	    services.setNom(s.getNom());
	    services.setDescription(s.getDescription());
	    services.setAdresse(s.getAdresse());
	    services.setHeure_debut(s.getHeure_debut());
	    services.setHeure_fin(s.getHeure_fin());
	    services.setPhoto(s.getPhoto());

	    //Category p = categoryrepository.findById(s.getCategory_id()).orElse(null); 
	    //Personne p2 = personnerepository.findById(s.getUser_id()).orElse(null); 

	    // Set the retrieved Category and Personne objects
	    //services.setCategory(p);
	    //services.setOwner(p2);

	    // Save the Services object to the repository
	    System.out.println("service add ");
	    return servicerepository.save(services); 
	}
	@Override
	public Services findServiceById(Long id) {
		// TODO Auto-generated method stub
		servicerepository.findById(id); 
		return null;
	}
	@Override
	public List<Services> findByNomContaining(String nom) {
        return servicerepository.findByNomContaining(nom);
    }

	@Override
	public List<Services> findAllServices() {
		// TODO Auto-generated method stub
		//System.out.println("FindServicesByLocation called with name: ");

		return servicerepository.findAll();
	}
	@Override
	public List<Services> findByAddresseContaining(String adresse) {
        return servicerepository.findByAdresseContaining(adresse);
    }

	@Override
	public List<Services> FindServicesByLocation(String name, String Location) {
		// TODO Auto-generated method stub
		//System.out.println("FindServicesByLocation called with name: " + name + " and location: " + Location);
        return servicerepository.findByNomContainingAndAdresseContaining(name, Location);
	}

	@Override
	public Personne GetOwnerofService(Long id) {
		// TODO Auto-generated method stub
		Personne  p =  servicerepository.findById(id).get().getOwner(); 
		return p;
	}

}
