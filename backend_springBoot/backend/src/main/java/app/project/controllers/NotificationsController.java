package app.project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.Services.NotificationsServiceImp;
import app.project.entities.Notifications;



@RestController
@RequestMapping("/notifications")
public class NotificationsController {
	
	@Autowired
	NotificationsServiceImp NotificationsService;
	
	@GetMapping ("/getall")
    public List<Notifications> getAllNotifications() {
        return NotificationsService.findAllNotifications();
    }
	
	 @GetMapping("/getbyId/{id}")
	    public ResponseEntity<Notifications> getNotificationById(@PathVariable Long id) {
	        Notifications notification = NotificationsService.findNotificationById(id);
	        if (notification != null) {
	            return ResponseEntity.ok(notification);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 
	 @PostMapping ("/createNot")
	    public Notifications createNotification(@RequestBody Notifications notification) {
	        return NotificationsService.saveNotification(notification);
	    }
	 
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
	        Notifications existingNotification = NotificationsService.findNotificationById(id);
	        if (existingNotification != null) {
	        	NotificationsService.deleteNotification(id);
	            return ResponseEntity.ok().build();
	        }
	        return ResponseEntity.notFound().build();
	    }
	
	
	
	

}
