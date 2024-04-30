package app.project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.Services.ReportsServiceImp;
import app.project.entities.Reports;

@RestController
@RequestMapping("/reports")
public class ReportsController {
	
	@Autowired
    private ReportsServiceImp reportsService;
	
	 @PostMapping("/createRepo")
	    public Reports createReport(@RequestBody Reports report) {
	        return reportsService.saveReport(report);
	    }
	 
	 @GetMapping("/getall")
	    public List<Reports> getAllReports() {
	        return reportsService.findAllReports();
	    }
	 
	 @GetMapping("/getbyId/{id}")
	    public ResponseEntity<Reports> getReportById(@PathVariable Long id) {
	        Reports report = reportsService.findReportById(id);
	        if (report != null) {
	            return ResponseEntity.ok(report);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 
	 @PutMapping("/update/{id}")
	    public ResponseEntity<Reports> updateReport(@PathVariable Long id, @RequestBody Reports updatedReport) {
	        Reports existingReport = reportsService.findReportById(id);
	        if (existingReport != null) {
	            existingReport.setClient_id(updatedReport.getClient_id());
	            existingReport.setPrestataire_id(updatedReport.getPrestataire_id());
	            existingReport.setMessage(updatedReport.getMessage());
	            existingReport.setStatus(updatedReport.isStatus());
	            existingReport.setService_reported(updatedReport.getService_reported());
	            reportsService.saveReport(existingReport);
	            return ResponseEntity.ok(existingReport);
	        }
	        return ResponseEntity.notFound().build();
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
	        Reports existingReport = reportsService.findReportById(id);
	        if (existingReport != null) {
	            reportsService.deleteReport(id);
	            return ResponseEntity.ok().build();
	        }
	        return ResponseEntity.notFound().build();
	    }

}
