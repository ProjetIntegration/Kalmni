package app.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import app.project.entities.Services;
import app.project.repository.ServicesRepository;


public class ServicesServiceImp implements ServicesService {
	
	 @Autowired
	  ServicesRepository servicesRepository;

	    // Create or update a service
	 @Override
	    public Services CreateService(Services service) {
	        return servicesRepository.save(service);
	    }
	    
	   

	    // Read a single service by ID

		@Override
		public Services getServicebyID(Long id) {
			return servicesRepository.findById(id).get();
		}
		
		

	    // Read all services
		@Override
	    public List<Services> getAllServices() {
	        return servicesRepository.findAll();
	    }
	    
	    
	    

	    // Delete a service
		@Override
	    public void deleteServiceById(Long id) {
	        servicesRepository.deleteById(id);
	    }
		
		@Override
	    public void deleteService(Services service) {
	        servicesRepository.delete(service);
	    }
	    
	    
	    
	    

		@Override
		 public Services updateService(Long id, Services updatedService) {
	        return servicesRepository.findById(id)
	                .map(service -> {
	                    service.setNom(updatedService.getNom());
	                    service.setDescription(updatedService.getDescription());
	                    service.setCategory_id(updatedService.getCategory_id());
	                    service.setAdresse(updatedService.getAdresse());
	                    service.setHeure_debut(updatedService.getHeure_debut());
	                    service.setHeure_fin(updatedService.getHeure_fin());
	                    return servicesRepository.save(service);
	                })
	                .orElseGet(() -> {
	                    updatedService.setServiceId(id);
	                    return servicesRepository.save(updatedService);
	                });
	    }
		
		@Override
		 public List<Services> findServicesByAdresse(String adresse) {
		        return servicesRepository.findByAdresseContainingIgnoreCase(adresse);
		    }

}
