package app.project.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Category")

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long CategoryId ;

	@Column(name="nom")
	private String nom; 
	@OneToMany(mappedBy="category")
    private Set<Services> services;
	
	public Category(Long categoryId, String nom, Set<Services> services) {
		super();
		CategoryId = categoryId;
		this.nom = nom;
		this.services = services;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(Long categoryId) {
		CategoryId = categoryId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Services> getServices() {
		return services;
	}

	public void setServices(Set<Services> services) {
		this.services = services;
	}
	
	
	
	
	
}