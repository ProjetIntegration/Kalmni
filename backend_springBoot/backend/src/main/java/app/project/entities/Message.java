package app.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import app.project.repository.MessageRepository;


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


	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Message(String message, Long sender_id, Long receiver_id, Personne person_receiver) {
		super();
		this.message = message;
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.person_receiver = person_receiver;
	}


	public Long getMsgId() {
		return MsgId;
	}


	public void setMsgId(Long msgId) {
		MsgId = msgId;
	}


	public String getMessage() {
		return message;
	}
	
	
	


	public void setMessage(String message) {
		this.message = message;
	}


	public Long getSender_id() {
		return sender_id;
	}


	public void setSender_id(Long sender_id) {
		this.sender_id = sender_id;
	}


	public Long getReceiver_id() {
		return receiver_id;
	}


	public void setReceiver_id(Long receiver_id) {
		this.receiver_id = receiver_id;
	}


	public Personne getPerson_receiver() {
		return person_receiver;
	}


	public void setPerson_receiver(Personne person_receiver) {
		this.person_receiver = person_receiver;
	} 
	  
	 
	  
	
	
}
