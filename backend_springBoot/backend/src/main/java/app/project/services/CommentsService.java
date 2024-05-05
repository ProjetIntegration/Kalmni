package app.project.services;

import java.util.List;

import app.project.entities.Comments;

public interface CommentsService {
	 Comments saveComment(Comments comment);
	 List<Comments> findAllComments();
	 Comments findCommentById(Long id);
	 void deleteComment(Long id);

}
