package app.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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
	
	@Test 
	public void finder() throws ParseException
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf("12-10-2002"));
		Personne  p  = new Personne(); 
		p.setAddresse("tunis");
		p.setPrenom("akram");
		p.setNom("zaabi");
		p.setPassword("123");
		p.setEmail("akram@gmail.com");
		p.setDate(dateCreation);
		personneRepository.save(p); 
	}

}
