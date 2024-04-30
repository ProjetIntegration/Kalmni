package app.project.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long>{

}
