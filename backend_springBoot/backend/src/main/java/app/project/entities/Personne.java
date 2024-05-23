package app.project.entities;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Personne")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private Long PersonneId ;
	  @Column(name="nom")
	  private String nom ; 
	  @Column(name="Prenom")
	  private String prenom ;
	  @Column(name="email")
	  private String email ;
	  @Column(name="Password")
	  private String password ;
	  @Column(name="role_number")
	  private String Role  ;
	  @Column(name="addresse")
	  private String addresse ;
	  @Column(name="Date")
	  private Date date; 
	  
	  @OneToMany(mappedBy="Owner")
	  private List<Services>  services; 
	  
	 public List<Services> getServices() {
		return services;
	}


	public void setServices(List<Services> services) {
		this.services = services;
	}
	@OneToMany(mappedBy="person_receiver")
	 private List<Message>messages;
	
	 @OneToMany(mappedBy="person_notifications_receiver")
	 private List<Notifications>Notifs; 
	 
	 
	 @OneToMany(mappedBy="person_posts")
	 private List<Post>posts; 
	 
	
	 
	 @OneToMany(mappedBy="person_id_comments")
	 private List<Comments>comments; 
	 
	 @OneToMany(mappedBy="person_projects")
	 private List<Projects>PersonProjects; 
	 
	 
	 @OneToMany(mappedBy="user_service_registrated")
	 private List<ServiceUser>Personnes_registrated;


	public Long getPersonneId() {
		return PersonneId;
	}


	public void setPersonneId(Long personneId) {
		PersonneId = personneId;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole_number() {
		return Role;
	}


	public void setRole_number(String Role) {
		this.Role = Role;
	}


	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<Message> getMessages() {
		return messages;
	}


	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}


	public List<Notifications> getNotifs() {
		return Notifs;
	}


	public void setNotifs(List<Notifications> notifs) {
		Notifs = notifs;
	}


	public List<Post> getPosts() {
		return posts;
	}


	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public List<Comments> getComments() {
		return comments;
	}


	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}


	public List<Projects> getPersonProjects() {
		return PersonProjects;
	}


	public void setPersonProjects(List<Projects> personProjects) {
		PersonProjects = personProjects;
	}


	public List<ServiceUser> getPersonnes_registrated() {
		return Personnes_registrated;
	}


	public void setPersonnes_registrated(List<ServiceUser> personnes_registrated) {
		Personnes_registrated = personnes_registrated;
	}
	
	 
	 
	 public Personne()
	 {
		 super(); 
	 }
	 public Personne(String nom , String prenom , String email ,  String password , String role_number ,  String addresse ,  Date date)
	 {
		 this.nom=nom ; 
		 this.prenom=prenom; 
		 this.addresse=addresse; 
		 this.date=date; 
		 this.email=email; 
		 this.Role=role_number; 
		 this.password=password; 
		 
	 }
	 
	 
}
