package app.project.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Projects")

public class Projects{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long ProjectId ;
	
	@Column(name="name")
	private String ProjectName  ;
	
	@Column(name="description")
	private String Projectdescription  ;
	
	
	@Column(name="photo" ,length =99999999)
	private String Projectphoto  ;
	
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="fk_PersonneId")
	private Personne person_projects;

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(Long projectId, String projectName, String projectdescription, String projectphoto,
			Personne person_projects) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
		Projectdescription = projectdescription;
		Projectphoto = projectphoto;
		this.person_projects = person_projects;
	}

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectdescription() {
		return Projectdescription;
	}

	public void setProjectdescription(String projectdescription) {
		Projectdescription = projectdescription;
	}

	public String getProjectphoto() {
		return Projectphoto;
	}

	public void setProjectphoto(String projectphoto) {
		Projectphoto = projectphoto;
	}

	public Personne getPerson_projects() {
		return person_projects;
	}

	public void setPerson_projects(Personne person_projects) {
		this.person_projects = person_projects;
	} 
	
	
	
	
	 
}