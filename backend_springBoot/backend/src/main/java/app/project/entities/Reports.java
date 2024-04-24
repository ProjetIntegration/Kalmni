package app.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Reports")
public class Reports {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private int Id ; 
	  
	  @Column(name="client_id")
	  private int client_id; 
	  
	  @Column(name="prestataire_id")
	  private int prestataire_id; 
	  
	  @Column(name="message")
	  private String message;

	   @Column(name="status")
	  private boolean status;
	  
	  @ManyToOne
	  @JoinColumn(name="service_user_repored")
	  private ServiceUser service_reported; 
	  	
}

