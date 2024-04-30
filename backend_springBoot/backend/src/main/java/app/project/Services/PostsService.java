package app.project.Services;

import java.util.List;

import app.project.entities.Post;

public interface PostsService {
	
	Post savePost(Post post);
	List<Post> findAllPosts();
	Post findPostById(Long id);
	void deletePost(Long id);

}
