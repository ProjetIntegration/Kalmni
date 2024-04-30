package app.project.Services;
import java.util.List;



import app.project.entities.Message;

public interface MessageService {
	
	Message saveMessage(Message m);
	void deleteMessage(Long id);
	List<Message> getAllMessage();
	Message getMessagebyID(Long id);
	
	

}
