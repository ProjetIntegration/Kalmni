package app.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Services;


public interface ServicesRepository  extends JpaRepository<Services, Long>{
	 List<Services> findByAdresseContainingIgnoreCase(String adresse);
}
