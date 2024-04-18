package app.project.entities;


import java.util.Date;
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
@Table(name="Post")

public class Post{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int ProjectId ;
	
	@Column(name="name")
	private String PostName  ;
	
	@Column(name="description")
	private String Postdescription  ;
	
	@Column(name="photo")
	private String Postphoto  ;
	
	@Column(name="Date")
	private Date PostDate  ;
	
	@Column(name="montant")
	private double montant  ;
	  
	@ManyToOne
	@JoinColumn(name="fk_PersonneId")
	private Personne person_posts; 
	
	@OneToMany(mappedBy="post_id_posts")
	 private Set<Comments>comments;
}