package app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category , Long>  {

}
