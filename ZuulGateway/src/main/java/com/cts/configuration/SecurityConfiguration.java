package com.cts.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {

	//Authentication : set user/password details and mention the role.
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("jayant").password("{noop}jayant").roles("USER").and()
				.withUser("shivam").password("{noop}shivam").roles("ADMIN");
	}

	// Authorization : mention which role can access which URL
	protected void configure(HttpSecurity http) throws Exception
	{
		http.httpBasic().and().authorizeRequests()
				.antMatchers("/Transaction-Statistic/statistics").hasRole("ADMIN")
				.antMatchers("/Banking-Transaction/transaction").hasRole("USER")
				.and().csrf().disable().headers()
				.frameOptions().disable();
	}
}
