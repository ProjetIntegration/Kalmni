package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Long> {

}
