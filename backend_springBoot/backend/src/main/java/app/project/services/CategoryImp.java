package app.project.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Category;
import app.project.entities.Services;
import app.project.repository.CategoryRepository;

@Service
public class CategoryImp implements CategoryService{

	@Autowired 
	CategoryRepository categoryrepo; 
	@Override
	public Category saveCategory(Category c) {
		// TODO Auto-generated method stub
		return categoryrepo.save(c);
	}

	@Override
	public List<Category> findAllCtagories() {
		// TODO Auto-generated method stub
		return categoryrepo.findAll();
	}

	@Override
	public Category findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return categoryrepo.findById(id).get();
	}

	@Override
	public void deleteCategory(Long id) {
		
		categoryrepo.deleteById(id);
		
	}

	@Override
	public Set<Services> GetServicesPerCtageory(Long id) {
		// TODO Auto-generated method stub
		Category  cat =  categoryrepo.findById(id).get();
		return  cat.getServices(); 
	}

}
