package app.project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.Services.ProjectsServiceImp;
import app.project.entities.Projects;

@RestController
@RequestMapping("/projects")
public class ProjectsController {
	
	@Autowired
     ProjectsServiceImp projectsService;
	
	 @GetMapping("/getall")
	    public List<Projects> getAllProjects() {
	        return projectsService.findAllProjects();
	    }
	 @GetMapping("/getbyId/{id}")
	    public ResponseEntity<Projects> getProjectById(@PathVariable Long id) {
	        Projects project = projectsService.findProjectById(id);
	        if (project != null) {
	            return ResponseEntity.ok(project);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 @PostMapping("/createPro")
	    public Projects createProject(@RequestBody Projects project) {
	        return projectsService.saveProject(project);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
	        Projects existingProject = projectsService.findProjectById(id);
	        if (existingProject != null) {
	        	projectsService.deleteProject(id);
	            return ResponseEntity.ok().build();
	        }
	        return ResponseEntity.notFound().build();
	    }
	 

}
