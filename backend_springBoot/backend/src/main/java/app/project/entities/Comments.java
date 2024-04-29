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
	  private Long CommentId ; 
	  

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
	
	  public Comments() {
			super();
			// TODO Auto-generated constructor stub
		}

	public Comments(Long commentId, String message, Date commenttDate, Personne person_id_comments,
			Post post_id_posts) {
		super();
		CommentId = commentId;
		this.message = message;
		CommenttDate = commenttDate;
		this.person_id_comments = person_id_comments;
		this.post_id_posts = post_id_posts;
	}

	public Long getCommentId() {
		return CommentId;
	}

	public void setCommentId(Long commentId) {
		CommentId = commentId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCommenttDate() {
		return CommenttDate;
	}

	public void setCommenttDate(Date commenttDate) {
		CommenttDate = commenttDate;
	}

	public Personne getPerson_id_comments() {
		return person_id_comments;
	}

	public void setPerson_id_comments(Personne person_id_comments) {
		this.person_id_comments = person_id_comments;
	}

	public Post getPost_id_posts() {
		return post_id_posts;
	}

	public void setPost_id_posts(Post post_id_posts) {
		this.post_id_posts = post_id_posts;
	}
	  
}