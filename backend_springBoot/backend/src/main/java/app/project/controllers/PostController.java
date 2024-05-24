package app.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Personne;
import app.project.entities.Post;
import app.project.entities.PostPayload;
import app.project.entities.Projects;
import app.project.services.PostsServiceImp;


@RestController
public class PostController {
	@Autowired
	PostsServiceImp postsServiceImp ; 
	
	@PostMapping("/AddPost")
	public ResponseEntity<?> SavePost(@RequestBody PostPayload post ){
		
		return ResponseEntity.ok().body(postsServiceImp.savePost(post)) ;
	}

	
	
	

}
