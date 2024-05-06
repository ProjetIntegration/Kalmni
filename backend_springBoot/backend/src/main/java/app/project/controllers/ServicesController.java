package app.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import app.project.entities.Services;

import app.project.services.ServicesService;

@RestController
@RequestMapping("/services")
public class ServicesController {
	 @Autowired
	   ServicesService servicesService;

	    @PostMapping("/")
	    public ResponseEntity<Services> createService(@RequestBody Services service) {
	        return ResponseEntity.ok(servicesService.CreateService(service));
	    }

	    @GetMapping("/{id}")
	    public Services getServiceById(@PathVariable ("id") Long id) {
	        return servicesService.getServicebyID(id);
	    }
	    
	    
	   

	    @GetMapping("/")
	    public List<Services> getAllServices() {
	        return servicesService.getAllServices();
	    }

	    @PutMapping("/")
	    public ResponseEntity<Services> updateService(@PathVariable Long id, @RequestBody Services service) {
	        return ResponseEntity.ok(servicesService.updateService(id, service));
	    }

	   
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
	        servicesService.deleteServiceById(id);
	        return ResponseEntity.ok().build();
	    }
	    
	    @GetMapping("/search")
	    public ResponseEntity<List<Services>> getServicesByAdresse(@RequestParam String adresse) {
	        List<Services> services = servicesService.findServicesByAdresse(adresse);
	        if (services.isEmpty()) {
	            return ResponseEntity.noContent().build();
	        }
	        return ResponseEntity.ok(services);
	    }

}
