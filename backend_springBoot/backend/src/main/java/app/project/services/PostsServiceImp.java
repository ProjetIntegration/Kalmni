package app.project.services;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Category;
import app.project.entities.PayloadService;
import app.project.entities.Personne;
import app.project.entities.Post;
import app.project.entities.PostPayload;
import app.project.entities.Projects;
import app.project.entities.Services;
import app.project.repository.PersonneRepository;
import app.project.repository.PostRepository;
import app.project.repository.ProjectsRepository;

@Service
public class PostsServiceImp implements PostsService{
	
	@Autowired
    private PostRepository postRepository;
	@Autowired
    private ProjectsRepository projectsRepository;
	@Autowired
    private PersonneRepository personneRepository;
	
	@Override
	public Post savePost(PostPayload post) {
		Post p = new Post();
		
		Personne personne  = personneRepository.findById(post.getPersonne_id()).get();
		p.setPerson_posts(personne);
		p.setMontant(post.getMontant());
		p.setPostName(post.getNom());
		p.setPostDate(new Date());
		p.setPostdescription(post.getDescription());
		p.setPostphoto(post.getPhoto());
		p.setComments(new HashSet<>());
		
        return postRepository.save(p);
        
    }
	
	
	
	@Override
	public List<Post> findAllPosts() {
        return postRepository.findAll();
    }
	
	@Override
	 public Post findPostById(Long id) {
	        return postRepository.findById(id).orElse(null);
	 }
	
	@Override 
	 public void deletePost(Long id) {
	        postRepository.deleteById(id);
	 }
	
	public List<Post> getPostsSortedByMontant() {
       // return postRepository.findAllSortedByMontantDesc();
		return null ; 
    }
	 


}
