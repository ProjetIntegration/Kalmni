package app.project.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments {

	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private int CommentId ; 
	  
	  @Column(name="message_txt")
	  private String message; 
	  
	  @Column(name="Date")
		private Date CommenttDate  ;
	  
	  
	  @ManyToOne
	  @JoinColumn(name="fk_PersonneId")
	  private Personne person_id_comments; 
	  
	  @ManyToOne
	  @JoinColumn(name="fk_PostId")
	  private Post post_id_posts; 
	
}