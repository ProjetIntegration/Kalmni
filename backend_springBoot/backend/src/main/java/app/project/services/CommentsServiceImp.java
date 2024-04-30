package app.project.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Comments;
import app.project.repositorys.CommentsRepository;

@Service
public class CommentsServiceImp implements CommentsService {
	
	 @Autowired
	   CommentsRepository commentsRepository;
	 
	 @Override
	 public Comments saveComment(Comments comment) {
	        return commentsRepository.save(comment);
	    }
	 
	 @Override
	 public List<Comments> findAllComments() {
	        return commentsRepository.findAll();
	    }
	 
	 @Override
	 public Comments findCommentById(Long id) {
	        Optional<Comments> result = commentsRepository.findById(id);
	        return result.orElse(null);
	    }
	 
	 @Override
	 public void deleteComment(Long id) {
	        commentsRepository.deleteById(id);
	    }

}
