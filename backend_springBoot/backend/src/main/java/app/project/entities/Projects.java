package app.project.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Projects")

public class Projects{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int ProjectId ;
	
	@Column(name="name")
	private String ProjectName  ;
	
	@Column(name="description")
	private String Projectdescription  ;
	
	
	@Column(name="photo")
	private String Projectphoto  ;
	
	@ManyToOne
	@JoinColumn(name="fk_PersonneId")
	private Personne person_projects; 
	
	private int x;
	 
}