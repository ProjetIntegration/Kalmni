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
@Table(name="Notifications")
public class Notifications {

	
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private int NotifId ;
	 
	 @Column(name="message")
	 private String message;  
	 
	 
	 
	  @ManyToOne
	  @JoinColumn(name="fk_PersonneId")
	  private Personne person_notifications_receiver; 
}
