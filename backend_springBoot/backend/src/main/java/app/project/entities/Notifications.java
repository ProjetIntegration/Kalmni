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
	  private Long NotifId ;
	 
	 @Column(name="message")
	 private String message;  
	 
	 
	 
	  @ManyToOne
	  @JoinColumn(name="fk_PersonneId")
	  private Personne person_notifications_receiver;



	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Notifications(Long notifId, String message, Personne person_notifications_receiver) {
		super();
		NotifId = notifId;
		this.message = message;
		this.person_notifications_receiver = person_notifications_receiver;
	}



	public Long getNotifId() {
		return NotifId;
	}



	public void setNotifId(Long notifId) {
		NotifId = notifId;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public Personne getPerson_notifications_receiver() {
		return person_notifications_receiver;
	}



	public void setPerson_notifications_receiver(Personne person_notifications_receiver) {
		this.person_notifications_receiver = person_notifications_receiver;
	} 
	  
	  
}
