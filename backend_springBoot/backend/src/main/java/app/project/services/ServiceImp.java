package app.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.project.entities.Category;
import app.project.entities.Personne;
import app.project.entities.Projects;
import app.project.entities.Services;
import app.project.repository.CategoryRepository;
import app.project.repository.PersonneRepository;
import app.project.repository.ServiceRepository;

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
	public Services saveService(Services services,Long IdCtaegory,Long IdPersonne) {
		// TODO Auto-generated method stub
		Category p =  categoryrepository.findById(IdCtaegory).get(); 
		Personne p2=  personnerepository.findById(IdPersonne).get(); 
		services.setCategory(p);
		services.setOwner(p2);
		servicerepository.save(services); 
		return  services; 
	}
	@Override
	public Services findServiceById(Long id) {
		// TODO Auto-generated method stub
		servicerepository.findById(id); 
		return null;
	}

	@Override
	public List<Services> findAllServices() {
		// TODO Auto-generated method stub
		List<Services>s = servicerepository.findAll();
		return s; 
	}

	@Override
	public List<Services> FindServicesByLocation(String name, String Location) {
		// TODO Auto-generated method stub
		return null; //servicerepository.FindByNameAndLocation(name, Location);
	}

	@Override
	public Personne GetOwnerofService(Long id) {
		// TODO Auto-generated method stub
		Personne  p =  servicerepository.findById(id).get().getOwner(); 
		return p;
	}

}
