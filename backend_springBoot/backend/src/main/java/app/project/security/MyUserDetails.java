package app.project.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import app.project.entities.Personne;

public class MyUserDetails implements UserDetails {
	 private Personne user;
	 
	    public MyUserDetails(Personne u) {
		    user=u;
	    }
	 
	    @Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
		    List<SimpleGrantedAuthority> authorities=new ArrayList();
		    try {
		    	String role = user.getRole_number();
		    	authorities=new ArrayList<>();
		    	authorities.add(new SimpleGrantedAuthority(role));
		    	
		    }catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
		    return authorities;
		}
	    
	   /* @Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			List<SimpleGrantedAuthority> authorities=new ArrayList<>();
		    String userRole=user.getRole();
		    authorities.add(new SimpleGrantedAuthority(userRole));
			return authorities;
		}*/
	 
	    @Override
		public String getPassword() {
			return user.getPassword();
		}

		@Override
		public String getUsername() {
			return user.getEmail();
		}
		
		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}


}
