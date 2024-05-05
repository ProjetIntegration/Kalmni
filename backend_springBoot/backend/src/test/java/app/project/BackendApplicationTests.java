package app.project;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.project.entities.Message;
import app.project.entities.Personne;
import app.project.repository.MessageRepository;
import app.project.repository.PersonneRepository;

@SpringBootTest
class BackendApplicationTests {
	@Autowired
	private PersonneRepository personneRepository; 
	
	@Autowired 
	private MessageRepository messageRepository;
	

	@Test
	public void saveMessage() {
		   Personne p1 = personneRepository.findById(1L).orElse(null);
	        Personne p2 = personneRepository.findById(2L).orElse(null);
	        if (p1 != null && p2 != null) {
	            Message m = new Message("inshalah tekhdem ", p1.getPersonneId(), p2.getPersonneId(), p2);
	            messageRepository.save(m);
	        } else {
	            System.out.println("One or both personnes not found.");
	        }
		System.out.println("hello");
	}
	/*@Test void finder()
	{
		Personne  p  = personneRepository.findById(1L); 
	}*/

}
