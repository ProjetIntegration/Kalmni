package app.project.services;

import java.util.List;

import app.project.entities.Services;

public interface ServicesService {
	
	 public Services CreateService(Services service); 
	 public Services getServicebyID(Long id); 
	 public List<Services> getAllServices() ;
	 public void deleteServiceById(Long id) ;
	 public void deleteService(Services id) ;
	 public Services updateService(Long id, Services updatedService);
	 public List<Services> findServicesByAdresse(String adresse);

}
