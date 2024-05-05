package app.project.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Notifications;
import app.project.services.NotificationsServiceImp;

@RestController
public class NotificationsController {

	
	
	@Autowired
	NotificationsServiceImp NotifisService; 
	
	
	@GetMapping("/Notifs")
	public List<Notifications> GetAll()
	{
		List<Notifications> p =  NotifisService.findAllNotifications(); 
		
		return   p ; 
	}
	
	
	@GetMapping("/Notifs/{id}")
	public Notifications GetNotif(@PathVariable("id") Long id )
	{
		return  NotifisService.findNotificationById(id); 
	}
	
	@PostMapping("/ReceiveNotif")
	public Notifications SendNotif(@RequestBody Notifications notif)
	{
		return  NotifisService.saveNotification(notif); 
	}
	
}
