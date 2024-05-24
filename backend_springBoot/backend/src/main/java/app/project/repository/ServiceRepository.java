package app.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.project.entities.Services;

public interface ServiceRepository extends JpaRepository<Services, Long> {
    //@Query("select p from Services p where p.nom like %:nom% and p.adresse like %:adresse%")
    List<Services> findByNomContainingAndAdresseContaining(String nom, String adresse);
	List<Services> findByNomContaining(String nom);
	List<Services> findByAdresseContaining(String adresse);

	
}
