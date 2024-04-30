package app.project.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Message;
import app.project.repositorys.MessageRepository;


@Service
public class MessageServiceImp implements MessageService {
	
	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public Message saveMessage(Message m) {
	 return messageRepository.save(m);
	 }
	
	@Override
	public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
	
	@Override
	public Message getMessagebyID(Long id) {
		return messageRepository.getById(id);
	}
	
	@Override
	public List<Message> getAllMessage() {
	    return messageRepository.findAll();
	 }


	
	

}
