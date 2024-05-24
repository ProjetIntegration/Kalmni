package app.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category , Long>  {
	//@Query(value="select * from Category where category_id=:category_id",nativeQuery=true)

	

	

}
