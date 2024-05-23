package app.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
	  
	  
	  public Reviews(Long id, Long service_id, String message, Long user_id_sender, Long user_id_receiver, int rate,
			ServiceUser service_users_reviews) {
		super();
		Id = id;
		this.service_id = service_id;
		this.message = message;
		this.user_id_sender = user_id_sender;
		this.user_id_receiver = user_id_receiver;
		this.rate = rate;
		this.service_users_reviews = service_users_reviews;
	}


	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Long getService_id() {
		return service_id;
	}


	public void setService_id(Long service_id) {
		this.service_id = service_id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Long getUser_id_sender() {
		return user_id_sender;
	}


	public void setUser_id_sender(Long user_id_sender) {
		this.user_id_sender = user_id_sender;
	}


	public Long getUser_id_receiver() {
		return user_id_receiver;
	}


	public void setUser_id_receiver(Long user_id_receiver) {
		this.user_id_receiver = user_id_receiver;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public ServiceUser getService_users_reviews() {
		return service_users_reviews;
	}


	public void setService_users_reviews(ServiceUser service_users_reviews) {
		this.service_users_reviews = service_users_reviews;
	}
	  
	  
	  
	
	
}