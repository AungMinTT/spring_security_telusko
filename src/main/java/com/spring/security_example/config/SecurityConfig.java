package com.spring.security_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        // Disable CSRF Require
//        http.csrf(customizer->customizer.disable());
//
//        // Define Every Request Require Authenticated
//        http.authorizeHttpRequests(request-> request.anyRequest().authenticated());
//        // For authentication from browser
//        http.formLogin(Customizer.withDefaults());
//        // For authentication for Postman
//        http.httpBasic(Customizer.withDefaults());
//
//        // Create new session for every request
//        http.sessionManagement(
//                session -> session.sessionCreationPolicy(
//                        SessionCreationPolicy.STATELESS));
//
//        return http.build();
        return http.csrf(customizer->customizer.disable())
                .authorizeHttpRequests(request-> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(
                session -> session.sessionCreationPolicy(
                        SessionCreationPolicy.STATELESS))
                .build();
    }
}
