package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Message;

public interface MessageRepository extends JpaRepository<Message,Integer> {

}
