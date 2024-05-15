package app.project.services;

import java.util.List;

import app.project.entities.Personne;
import app.project.entities.Projects;
import app.project.entities.Services;

public interface Service {

	
	
	void deleteService(Long id);
	Services saveService(Services services,Long IdCtaegory,Long IdPersonne) ;
	Services  findServiceById(Long id);
	List<Services> findAllServices();
	List<Services>FindServicesByLocation(String name , String Location ); 	
	Personne GetOwnerofService(Long id); 
}
