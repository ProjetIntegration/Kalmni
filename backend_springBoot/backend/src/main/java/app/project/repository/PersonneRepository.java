package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.project.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
	Personne findByEmail(String email);
     @Query(value="select * from Personne where email=:email",nativeQuery=true)
     Personne getByEmail(String email);
}
