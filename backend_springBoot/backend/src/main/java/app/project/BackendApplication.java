package app.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication  {
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		System.out.println("hello");
	}

}
