package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Comments;

public interface CommentsRepository extends JpaRepository<Comments , Long> {

}
