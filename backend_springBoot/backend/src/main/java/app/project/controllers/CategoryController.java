package app.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Category;
import app.project.repository.CategoryRepository;
import app.project.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryservice ; 
			
	 @PostMapping("/save")
	    public Category saveCategory(@RequestBody Category a) {
	        return categoryservice.saveCategory(a);
	    }
	 @GetMapping("/GetCategory/{id}")
	 
	 public Category getCategory(@PathVariable ("id") Long id)
	 {
		 return  categoryservice.findCategoryById(id);
	 }
	 @DeleteMapping("/DeleteCategory/{id}")
	 public void DeleteCategory(@PathVariable ("id") Long id)
	 {
		   categoryservice.deleteCategory(id);
	 }
		
	
	
}
