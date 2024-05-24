package app.project.services;

import java.util.List;

import app.project.entities.Post;
import app.project.entities.PostPayload;

public interface PostsService {
	
	Post savePost(PostPayload post);
	List<Post> findAllPosts();
	Post findPostById(Long id);
	void deletePost(Long id);

}
