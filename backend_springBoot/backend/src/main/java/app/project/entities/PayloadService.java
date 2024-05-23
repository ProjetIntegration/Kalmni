package app.project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PayloadService {
  private	String nom;
  private	String description;
  private String addresse;
  private	String photo;
  private	String heure_debut;
  private String heure_fin;
  private Long user_id;
  private Long category_id;
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
public String getAddresse() {
	return addresse;
}
public void setAddresse(String addresse) {
	this.addresse = addresse;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
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
public Long getUser_id() {
	return user_id;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public Long getCategory_id() {
	return category_id;
}
public void setCategory_id(Long category_id) {
	this.category_id = category_id;
}
 
}
