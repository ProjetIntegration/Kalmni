package app.project.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;


import app.project.entities.Reports;

public interface ReportsRepository extends JpaRepository<Reports, Long> {

}
