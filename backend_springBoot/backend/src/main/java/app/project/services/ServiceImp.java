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
	public Services saveService(PayloadService s) {
		Services services = new Services();
		Category p =  categoryrepository.findById(s.getCategory_id()).get(); 
		Personne p2=  personnerepository.findById(s.getUser_id()).get(); 
		services.setCategory(p);
		services.setOwner(p2);
		services.setAdresse(s.getAddresse());
		services.setDescription(s.getDescription());
		services.setNom(s.getNom());
		services.setHeure_debut(s.getHeure_debut());
		services.setHeure_fin(s.getHeure_fin());
		services.setPhoto(s.getPhoto());
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
