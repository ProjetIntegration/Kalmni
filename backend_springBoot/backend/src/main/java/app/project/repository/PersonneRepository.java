package app.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.project.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
	@Query(value="select * from personne where email=:email",nativeQuery=true)
	Optional<Personne> getUserByemail(String email);
}
