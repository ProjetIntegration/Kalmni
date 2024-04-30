package app.project;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.project.entities.Personne;
import app.project.repository.PersonneRepository;

@SpringBootTest
class BackendApplicationTests {
	@Autowired
	private PersonneRepository personneRepository; 

	
	@Test
	public void CreatePersonne() {
		// TODO Auto-generated method stub
		Date currentDate = new Date(); 
		Personne p  = new Personne("zaabi","akram","akramzaabi@gmail.com","ahlabik",1,"rades",currentDate);
		System.out.println(p);
		 personneRepository.save(p);
		
	}

}
