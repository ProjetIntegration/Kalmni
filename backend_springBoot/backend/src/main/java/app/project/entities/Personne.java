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
	  private int PersonneId ;
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
	 
	 
}
