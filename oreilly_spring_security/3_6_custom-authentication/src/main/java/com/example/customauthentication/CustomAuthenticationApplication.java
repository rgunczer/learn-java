package com.example.customauthentication;

import java.security.Principal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.ldap.authentication.LdapAuthenticationProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CustomAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomAuthenticationApplication.class, args);
	}

}

@RestController
class GreetingRestController {

	@GetMapping("/greeting")
	String greet(Principal principal) {
		return "greetings, " + principal.getName();
	}

}
/*
@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("ldapAuthProvider")
	private LdapAuthenticationProvider ldapAuthProvider;


	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest().fullyAuthenticated()
			.and()
			.formLogin();
	 }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.ldapAuthentication()
				.userDnPatterns("uid={0},ou=people")
				.groupSearchBase("ou=groups")
				.contextSource()
					.url("ldap://localhost:8389/dc=springframework,dc=org")
					.and()
				.passwordCompare()
					.passwordEncoder(new BCryptPasswordEncoder())
					.passwordAttribute("userPassword");
	}

}
*/

@Configuration
@EnableWebSecurity
class CustomSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private final CustomAuthenticationProvider ap;

	CustomSecurityConfiguration(CustomAuthenticationProvider ap) {
		this.ap = ap;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic();
		http.authorizeRequests().anyRequest().authenticated();			
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(this.ap);
	}
}

@Component
class CustomAuthenticationProvider implements AuthenticationProvider {

	private final List<SimpleGrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("USER"));

	private boolean isValid(String user, String pwd) {
		return user.equals("trevor") && pwd.equals("123");
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		if (isValid(username, password)) {
			return new UsernamePasswordAuthenticationToken(username, password, authorities);
		}
		throw new BadCredentialsException("Couldn't Authenticate using " + username + "!");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
