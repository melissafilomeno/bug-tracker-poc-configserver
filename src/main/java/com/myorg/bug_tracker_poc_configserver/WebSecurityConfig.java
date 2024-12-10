package com.myorg.bug_tracker_poc_configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * For testing purposes only, allowing all requests and disabling csrf
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests.anyRequest()
                                                                                .permitAll())
            .csrf(csrf -> csrf.disable());
        
        return http.build();
    }
}
