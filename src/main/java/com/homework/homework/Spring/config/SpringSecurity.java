package com.homework.homework.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(request -> request
                        .requestMatchers(HttpMethod.GET, "/api/tasks/**").authenticated()
                        .requestMatchers(HttpMethod.POST, "/api/tasks/**").authenticated()
                        .requestMatchers(HttpMethod.DELETE, "/api/tasks/**").authenticated()
                        .requestMatchers(HttpMethod.PUT, "/api/tasks/**").authenticated()
                        .anyRequest()
                        .permitAll())
                .httpBasic(Customizer.withDefaults()) // basic auth
                .csrf(AbstractHttpConfigurer::disable) // trzeba było dodać, bo bez tego postman mógł tylko Get methods
//                .formLogin(Customizer.withDefaults()) //form auth

                .build();
    }






}
