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
@Table(name="Reviews")
public class Reviews {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private Long Id ; 
	  
	  @Column(name="service_id")
	   private Long service_id ; 
	  
	  @Column(name="message")
	  private String message; 
	  
	  @Column(name="userId_sender")
	  private Long user_id_sender;

     @Column(name="userId_receiver")
	  private Long user_id_receiver;
         
      @Column(name="rate")
	  private int rate;


	  
	  
	  @ManyToOne
	  @JoinColumn(name="ServiceUser_reviews")
	  private ServiceUser service_users_reviews;
	  
	
	
}