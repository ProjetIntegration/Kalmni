package app.project.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



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
}