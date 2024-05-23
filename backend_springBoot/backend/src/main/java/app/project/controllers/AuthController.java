package app.project.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.project.entities.Personne;
import app.project.repository.PersonneRepository;
import app.project.security.UserDetailsServiceImpl;
import app.project.services.PersonneServiceImp;
import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
public class AuthController {
	
	
	    @Autowired
	    PersonneRepository userRepositiry;
	    @Autowired
		AuthenticationManager authenticationManager;
		 
		@Autowired
		UserDetailsServiceImpl userDetailsServiceImpl;
		@Autowired
		private app.project.security.SecurityConfig SecurityConfig;
		@Autowired
		private app.project.jwt.jwtTokenUtil jwtTokenUtil;
		@Autowired
		PersonneServiceImp userservice; 
	@PostMapping("/signUp")
	public ResponseEntity<?> SignUp(@RequestBody Personne user){
	 
		String roleList = user.getRole_number();
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
		/*try {
			mailsender.sendVerificationEmail(user);
		}catch(MessagingException e) {
			return new ResponseEntity<String>("Error Connexion",HttpStatus.CONFLICT);
		}catch(UnsupportedEncodingException e) {
			return new ResponseEntity<String>("Unsupported Forme",HttpStatus.CONFLICT);
		}*/
		userRepositiry.save(newUser);
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	}
}
