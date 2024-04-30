package app.project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Message;
import app.project.Services.MessageServiceImp;

@RestController
@RequestMapping("/Message")
public class MessageController {
	@Autowired
	MessageServiceImp MessageService;
	
	
	
	
	
	 @DeleteMapping("/delete/{id}")
	public void supprimerMessage(@RequestParam("id") Long id, ModelMap modelMap)
	{
		Message m= new Message();
		m.setMsgId(id);
		MessageService.deleteMessage(id);
		List<Message> msgs = MessageService.getAllMessage();
		modelMap.addAttribute("Messages", msgs);
	
	}
	 
	 
	
	 @GetMapping ("/getall")
	public void listeMessages(ModelMap modelMap)
	{
		List<Message> msgs = MessageService.getAllMessage();
		modelMap.addAttribute("messages", msgs);
		
	}
	 @GetMapping("/getbyId/{id}")
	public Message MonMessage(@RequestParam("id") Long id,ModelMap modelMap) {
		return MessageService.getMessagebyID(id);
	}
	
	 @PostMapping ("/createMess")
	public Message SaveMessage(Message m) {
		return MessageService.saveMessage(m);
	}
	
	
	
	

}
