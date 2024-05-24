package app.project.entities;

public class ServicePayLoad {
	private String nom;
	private String description;
	private String addresse;
	private String photo;
	private String heure_debut;
	private String heure_fin;
	private String CategoryId;
	private String PersonneId;
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
	public String getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(String categoryId) {
		CategoryId = categoryId;
	}
	public String getPersonneId() {
		return PersonneId;
	}
	public void setPersonneId(String personneId) {
		PersonneId = personneId;
	}
	
	

}
