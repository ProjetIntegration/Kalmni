package app.project.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.project.entities.Personne;
import app.project.repository.PersonneRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	 PersonneRepository userrep;
	 
	 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 	Optional<Personne> user=userrep.getUserByemail(username);
		 	if(user==null) {
		 		throw new UsernameNotFoundException("could not found email : "+username);
		 	}
		 	return user.map(MyUserDetails::new).get();	
	 }
	

}
