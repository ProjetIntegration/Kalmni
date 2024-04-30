package app.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.project.entities.Projects;
import app.project.repository.ProjectsRepository;
@Service
public class ProjectsServiceImp implements ProjectsService {
	
	@Autowired
     ProjectsRepository projectsRepository;

	@Override
    public List<Projects> findAllProjects() {
        return projectsRepository.findAll();
    }

	@Override
    public Projects findProjectById(Long id) {
        Projects result = projectsRepository.getById(id);;
        return result;
    }

	@Override
    public Projects saveProject(Projects project) {
        return projectsRepository.save(project);
    }

	@Override
    public void deleteProject(Long id) {
        projectsRepository.deleteById(id);
    }

}
