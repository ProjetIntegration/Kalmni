package app.project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import app.project.Services.PostsServiceImp;
import app.project.entities.Post;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
    private PostsServiceImp postService;
	
	@PostMapping("/createPos")
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }
	
	 @GetMapping("/getall")
	    public List<Post> getAllPosts() {
	        return postService.findAllPosts();
	    }
	 
	 @GetMapping("/getbyId/{id}")
	    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
	        Post post = postService.findPostById(id);
	        if (post != null) {
	            return ResponseEntity.ok(post);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 
	 
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
	        Post existingPost = postService.findPostById(id);
	        if (existingPost != null) {
	            existingPost.setPostName(updatedPost.getPostName());
	            existingPost.setPostdescription(updatedPost.getPostdescription());
	            existingPost.setPostphoto(updatedPost.getPostphoto());
	            existingPost.setPostDate(updatedPost.getPostDate());
	            existingPost.setMontant(updatedPost.getMontant());
	            existingPost.setPerson_posts(updatedPost.getPerson_posts());
	            existingPost.setComments(updatedPost.getComments());
	            postService.savePost(existingPost);
	            return ResponseEntity.ok(existingPost);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
	        if (postService.findPostById(id) != null) {
	            postService.deletePost(id);
	            return ResponseEntity.ok().build();
	        }
	        return ResponseEntity.notFound().build();
	    }

}
