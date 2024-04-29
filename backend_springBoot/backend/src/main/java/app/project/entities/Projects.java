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
	private Long ProjectId ;
	
	@Column(name="name")
	private String ProjectName  ;
	
	@Column(name="description")
	private String Projectdescription  ;
	
	
	@Column(name="photo")
	private String Projectphoto  ;
	
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