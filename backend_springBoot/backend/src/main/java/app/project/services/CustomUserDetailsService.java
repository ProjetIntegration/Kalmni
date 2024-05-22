package app.project.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.iset.produits.entities.DBUser;

import app.project.entities.Personne;
import app.project.repository.PersonneRepository;

import com.iset.produits.dao.DBUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private PersonneRepository dbUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Personne user = dbUserRepository.findByEmail(username);
		
		return new User(user.getEmail(), user.getPassword(), getGrantedAuthorities(user.getRole_number()));
	}

	private List<GrantedAuthority> getGrantedAuthorities(String role) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
		return authorities;
	}
}