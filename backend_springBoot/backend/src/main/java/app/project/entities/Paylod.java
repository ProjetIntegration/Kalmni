package app.project.entities;

import lombok.Data;

@Data
public class Paylod {
	private	String nom;
	  private	String description;
	  private String addresse;
	  private	String photo;
	  private	String heure_debut;
	  private String heure_fin;
	  private Long user_id;
	  private Long category_id;

}
