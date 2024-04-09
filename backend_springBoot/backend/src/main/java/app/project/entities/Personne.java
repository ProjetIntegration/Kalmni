package app.project.entities;






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
	 
	 
	 
	 
	 
	 @OneToMany(mappedBy="person_receiver")
	 private Set<Message>messages;
	
	 @OneToMany(mappedBy="person_notifications_receiver")
	 private Set<Notifications>Notifs;  
	 
}
