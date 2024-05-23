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
private String  heure_debut; 

@Column(name="heure_fin")
private String heure_fin; 

@Column(length = 999999999) 
private String Photo;

public String getPhoto() {
	return Photo;
}


public void setPhoto(String photo) {
	Photo = photo;
}



@ManyToOne
@JoinColumn(name="service_category")
private Category category; 

@ManyToOne
private Personne Owner; 

@OneToMany(mappedBy="service_user_registrated")
private Set<ServiceUser>service_registrated;



public void setOwner(Personne owner) {
	Owner = owner;
}


public Services(Long serviceId, String nom, String description, Category category_id, String adresse, String heure_debut,
		String heure_fin,String photo) {
	super();
	ServiceId = serviceId;
	this.nom = nom;
	this.description = description;
	this.category_id = category_id;
	this.adresse = adresse;
	this.heure_debut = heure_debut;
	this.heure_fin = heure_fin;
	this.Photo = photo; 
}


public Services() {
	super();
	// TODO Auto-generated constructor stub
}



public Long getServiceId() {
	return ServiceId;
}



public void setServiceId(Long serviceId) {
	ServiceId = serviceId;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public Category getCategory_id() {
	return category_id;
}

public Personne getOwner  ()
{
	return  Owner; 
}

public void setCategory_id(Category category_id) {
	this.category_id = category_id;
}



public String getAdresse() {
	return adresse;
}



public void setAdresse(String adresse) {
	this.adresse = adresse;
}



public String getHeure_debut() {
	return heure_debut;
}



public void setHeure_debut(String heure_debut) {
	this.heure_debut = heure_debut;
}



public String getHeure_fin() {
	return heure_fin;
}



public void setHeure_fin(String heure_fin) {
	this.heure_fin = heure_fin;
}



public Category getCategory() {
	return category;
}



public void setCategory(Category category) {
	this.category = category;
}



public Set<ServiceUser> getService_registrated() {
	return service_registrated;
}



public void setService_registrated(Set<ServiceUser> service_registrated) {
	this.service_registrated = service_registrated;
} 








}