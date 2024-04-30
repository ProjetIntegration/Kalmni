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
@Table(name="Services")

public class Services {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private Long ServiceId ;

@Column(name="nom")
private String nom;  

@Column(name="description")
private String description ;  

@ManyToOne
@JoinColumn(name="fk_CategoryId")
private Category category_id; 

@Column(name="adresse")
private String adresse; 

@Column(name="heure_debut")
private int heure_debut; 

@Column(name="heure_fin")
private int heure_fin; 

@ManyToOne
@JoinColumn(name="service_category")
private Category category; 



@OneToMany(mappedBy="service_user_registrated")
private Set<ServiceUser>service_registrated; 






}