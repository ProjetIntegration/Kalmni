package app.project.entities;






import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Personne")
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
	  private int role_number  ;
	  @Column(name="String")
	  private String addresse ;
	  @Column(name="Date")
	  private Date date; 
	  
	  
	  
	 @OneToMany(mappedBy="person_receiver")
	 private Set<Message>messages;
	
	 @OneToMany(mappedBy="person_notifications_receiver")
	 private Set<Notifications>Notifs; 
	 
	 
	 @OneToMany(mappedBy="person_posts")
	 private Set<Post>posts; 
	 
	
	 
	 @OneToMany(mappedBy="person_id_comments")
	 private Set<Comments>comments; 
	 
	 @OneToMany(mappedBy="person_projects")
	 private Set<Projects>PersonProjects; 
	 
	 
	 @OneToMany(mappedBy="user_service_registrated")
	 private Set<ServiceUser>Personnes_registrated;


	public Personne(Long personneId, String nom, String prenom, String email, String password, int role_number,
			String addresse, Date date, Set<Message> messages, Set<Notifications> notifs, Set<Post> posts,
			Set<Comments> comments, Set<Projects> personProjects, Set<ServiceUser> personnes_registrated) {
		super();
		PersonneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role_number = role_number;
		this.addresse = addresse;
		this.date = date;
		this.messages = messages;
		Notifs = notifs;
		this.posts = posts;
		this.comments = comments;
		PersonProjects = personProjects;
		Personnes_registrated = personnes_registrated;
	}


	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public int getRole_number() {
		return role_number;
	}


	public void setRole_number(int role_number) {
		this.role_number = role_number;
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


	public Set<Message> getMessages() {
		return messages;
	}


	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}


	public Set<Notifications> getNotifs() {
		return Notifs;
	}


	public void setNotifs(Set<Notifications> notifs) {
		Notifs = notifs;
	}


	public Set<Post> getPosts() {
		return posts;
	}


	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}


	public Set<Comments> getComments() {
		return comments;
	}


	public void setComments(Set<Comments> comments) {
		this.comments = comments;
	}


	public Set<Projects> getPersonProjects() {
		return PersonProjects;
	}


	public void setPersonProjects(Set<Projects> personProjects) {
		PersonProjects = personProjects;
	}


	public Set<ServiceUser> getPersonnes_registrated() {
		return Personnes_registrated;
	}


	public void setPersonnes_registrated(Set<ServiceUser> personnes_registrated) {
		Personnes_registrated = personnes_registrated;
	}
	 
	 
	 
	 
}
