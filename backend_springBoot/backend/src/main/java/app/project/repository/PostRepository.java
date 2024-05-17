package app.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Post;

public interface PostRepository  extends JpaRepository<Post, Long> {

	
	
	//public List<Post>findAllSortedByMontantDesc();
}
