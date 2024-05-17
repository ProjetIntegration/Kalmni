package app.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Post;
import app.project.repository.PostRepository;

@Service
public class PostsServiceImp implements PostsService{
	
	@Autowired
    private PostRepository postRepository;
	
	@Override
	public Post savePost(Post post) {
        return postRepository.save(post);
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
