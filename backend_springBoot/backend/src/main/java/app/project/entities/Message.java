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
@Table(name="Message")
public class Message {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private Long MsgId ; 
	  
	  @Column(name="message_txt")
	  private String message; 
	  
	  @Column(name="sender_id")
	  private Long sender_id; 
	  
	  @Column(name="receiver_id")
	  private Long receiver_id;
	  
	  
	  @ManyToOne
	  @JoinColumn(name="fk_PersonneId")
	  private Personne person_receiver; 
	  
	
	
}
