package app.project.services;

import java.util.List;
import java.util.Set;

import app.project.entities.Category;
import app.project.entities.Comments;
import app.project.entities.Services;

public interface CategoryService {

	
	
	Category saveCategory(Category c);
	 List<Category> findAllCtagories();
	 Category findCategoryById(Long id);
	 void deleteCategory(Long id);
	 Set<Services>GetServicesPerCtageory(Long id); 

}
