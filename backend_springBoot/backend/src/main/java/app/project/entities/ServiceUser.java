package app.project.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="ServiceUser")
public class ServiceUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long UserServId ;
	
	@ManyToOne
	@JoinColumn(name="service_related_to_user")
	private Services service_user_registrated; 
	
	
	@ManyToOne
	@JoinColumn(name="user_related_to_service")
	private Personne user_service_registrated;
	
	
	
	@OneToMany(mappedBy="service_users_reviews")
	private Set<Reviews>reviews_services ;
	
	@OneToMany(mappedBy="service_reported")
	private Set<Reports>reports_for_service ;

	public ServiceUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceUser(Long userServId, Services service_user_registrated, Personne user_service_registrated,
			Set<Reviews> reviews_services, Set<Reports> reports_for_service) {
		super();
		UserServId = userServId;
		this.service_user_registrated = service_user_registrated;
		this.user_service_registrated = user_service_registrated;
		this.reviews_services = reviews_services;
		this.reports_for_service = reports_for_service;
	}

	public Long getUserServId() {
		return UserServId;
	}

	public void setUserServId(Long userServId) {
		UserServId = userServId;
	}

	public Services getService_user_registrated() {
		return service_user_registrated;
	}

	public void setService_user_registrated(Services service_user_registrated) {
		this.service_user_registrated = service_user_registrated;
	}

	public Personne getUser_service_registrated() {
		return user_service_registrated;
	}

	public void setUser_service_registrated(Personne user_service_registrated) {
		this.user_service_registrated = user_service_registrated;
	}

	public Set<Reviews> getReviews_services() {
		return reviews_services;
	}

	public void setReviews_services(Set<Reviews> reviews_services) {
		this.reviews_services = reviews_services;
	}

	public Set<Reports> getReports_for_service() {
		return reports_for_service;
	}

	public void setReports_for_service(Set<Reports> reports_for_service) {
		this.reports_for_service = reports_for_service;
	}  
	
	
}