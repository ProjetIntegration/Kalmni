package app.project.entities;

import java.sql.Date;

public class PostPayload {
	private Long personne_id; 
	private String nom ;
	private String description;
	private String photo;
	private double montant;
	
	public Long getPersonne_id() {
		return personne_id;
	}
	public void setPersonne_id(Long personne_id) {
		this.personne_id = personne_id;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
