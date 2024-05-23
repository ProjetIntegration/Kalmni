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
@Table(name="Reports")
public class Reports {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private Long Id ; 
	  
	  @Column(name="client_id")
	  private Long client_id; 
	  
	  @Column(name="prestataire_id")
	  private Long prestataire_id; 
	  
	  @Column(name="message")
	  private String message;

	   @Column(name="status")
	  private boolean status;
	  
	  @ManyToOne
	  @JoinColumn(name="service_user_repored")
	  private ServiceUser service_reported;

	public Reports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reports(Long id, Long client_id, Long prestataire_id, String message, boolean status,
			ServiceUser service_reported) {
		super();
		Id = id;
		this.client_id = client_id;
		this.prestataire_id = prestataire_id;
		this.message = message;
		this.status = status;
		this.service_reported = service_reported;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public Long getPrestataire_id() {
		return prestataire_id;
	}

	public void setPrestataire_id(Long prestataire_id) {
		this.prestataire_id = prestataire_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ServiceUser getService_reported() {
		return service_reported;
	}

	public void setService_reported(ServiceUser service_reported) {
		this.service_reported = service_reported;
	} 
	  
	  
	  	
}

