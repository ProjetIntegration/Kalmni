package app.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import app.project.entities.Personne;
import app.project.entities.Projects;
import app.project.services.PersonneService;
import app.project.services.ProjectsService;

public class ProjectsController {
	 @Autowired
	    private ProjectsService projectsService;

	    @Autowired
	    private PersonneService personneService;

	    @GetMapping("/person/{personId}")
	    public List<Projects> getProjectsByPerson(@PathVariable Long personId) {
	        Personne person = personneService.findPersonById(personId);
	        return projectsService.findProjectsByPerson(person);
	    }
}
