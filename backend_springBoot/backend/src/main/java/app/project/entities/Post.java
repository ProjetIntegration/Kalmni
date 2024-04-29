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
	private Long ProjectId ;
	
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

	public Post(Long projectId, String postName, String postdescription, String postphoto, Date postDate,
			double montant, Personne person_posts, Set<Comments> comments) {
		super();
		ProjectId = projectId;
		PostName = postName;
		Postdescription = postdescription;
		Postphoto = postphoto;
		PostDate = postDate;
		this.montant = montant;
		this.person_posts = person_posts;
		this.comments = comments;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getPostName() {
		return PostName;
	}

	public void setPostName(String postName) {
		PostName = postName;
	}

	public String getPostdescription() {
		return Postdescription;
	}

	public void setPostdescription(String postdescription) {
		Postdescription = postdescription;
	}

	public String getPostphoto() {
		return Postphoto;
	}

	public void setPostphoto(String postphoto) {
		Postphoto = postphoto;
	}

	public Date getPostDate() {
		return PostDate;
	}

	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Personne getPerson_posts() {
		return person_posts;
	}

	public void setPerson_posts(Personne person_posts) {
		this.person_posts = person_posts;
	}

	public Set<Comments> getComments() {
		return comments;
	}

	public void setComments(Set<Comments> comments) {
		this.comments = comments;
	}
	
	
}