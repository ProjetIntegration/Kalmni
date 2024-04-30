package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.project.entities.Message;


public interface MessageRepository extends JpaRepository<Message, Long> {
    
     @Query(value = "select * from message where id=:id",nativeQuery = true)
     Message getById(Long id);
	
}
