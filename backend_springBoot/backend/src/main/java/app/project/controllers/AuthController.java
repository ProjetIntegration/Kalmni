package app.project.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.project.data.Credentials;
import app.project.entities.Personne;
import app.project.entities.Projects;
import app.project.repository.PersonneRepository;
import app.project.repository.ProjectsRepository;
import app.project.security.UserDetailsServiceImpl;
import app.project.services.PersonneServiceImp;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONObject;
@RestController
@RequiredArgsConstructor
public class AuthController {
	
	
	    @Autowired
	    PersonneRepository userRepositiry;
	    @Autowired
		AuthenticationManager authenticationManager;
	    @Autowired
	    ProjectsRepository projectrepo ; 
	    @Autowired
	    private ObjectMapper objectMapper;
		 
		@Autowired
		UserDetailsServiceImpl userDetailsServiceImpl;
		@Autowired
		private app.project.security.SecurityConfig SecurityConfig;
		@Autowired
		private app.project.jwt.jwtTokenUtil jwtTokenUtil;
		@Autowired
		PersonneServiceImp userservice; 
	@PostMapping(value = "/signUp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> SignUp(@RequestBody Map<String, Object> requestData){
	    Personne user = objectMapper.convertValue(requestData.get("user"), Personne.class);
	    Projects project = objectMapper.convertValue(requestData.get("Project"), Projects.class);
	 
	    
		String roleList = user.getRole_number();
		System.out.println(user.getAddresse()); 
		if(userRepositiry.getUserByemail(user.getEmail())==null) {
			return new ResponseEntity<String>("Email already Used",HttpStatus.CONFLICT);
		}
		
		Personne newUser = new Personne();
		newUser.setAddresse(user.getAddresse()); 
		newUser.setRole_number(user.getRole_number()); 
		newUser.setDate(user.getDate());
		newUser.setPrenom(user.getPrenom());
		newUser.setNom(user.getNom());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(SecurityConfig.passwordEncoder().encode(user.getPassword()));
		if(user.getPhoto() == "")
		{
			newUser.setPhoto(user.getPrenom().toUpperCase().charAt(0)+""+user.getNom().toUpperCase().charAt(0));
		}
		else {
			newUser.setPhoto(user.getPhoto()); 
		}
		
		newUser.setRole_number(roleList);
		userRepositiry.save(newUser);
		if(newUser.getRole_number().equals("Prestataire"))
		{
			Projects p =  new Projects(); 
			p.setProjectName(project.getProjectName()); 
			p.setProjectphoto(project.getProjectphoto()); 
			p.setProjectdescription(project.getProjectdescription());
			p.setPerson_projects(newUser); 
			projectrepo.save(p); 
			List<Projects>my =newUser.getMy_projects();
			if(my == null)
			{
				my = new ArrayList<>();
			}
			my.add(p); 
			newUser.setMy_projects(my); 
		}
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	}
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Credentials auth){
		try {
			
	        Optional<Personne> optionalUser = userRepositiry.getUserByemail(auth.getEmail());
	        if (!optionalUser.isPresent()) {
	            return new ResponseEntity<>("USER_NOT_FOUND", HttpStatus.CONFLICT);
	        }
            
	        Personne user = optionalUser.get();
	        Authentication authsuser = authenticationManager.authenticate(
	            new UsernamePasswordAuthenticationToken(auth.getEmail(), auth.getPassword()));
	        
	        UserDetails user_det = userDetailsServiceImpl.loadUserByUsername(auth.getEmail());
	        
	        if (user == null) {
	            return new ResponseEntity<>("USER_DISABLED", HttpStatus.CONFLICT);
	        }

	        String token = jwtTokenUtil.generateToken(user_det);
	        JSONObject res = new JSONObject();
	        res.put("token", token);
	        res.put("user", user);
	        return ResponseEntity.ok().body(res);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<>("INVALID_CREDENTIALS", HttpStatus.CONFLICT);
	    }
	}
}
