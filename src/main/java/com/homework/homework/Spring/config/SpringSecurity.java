package com.homework.homework.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(request -> request
                        .requestMatchers("/show/warehouse")
                        .authenticated()
                        .anyRequest()
                        .permitAll())
                .httpBasic(Customizer.withDefaults())
                .logout((logout) -> logout
                                .deleteCookies("remove")
                                .invalidateHttpSession(false)
                                .logoutUrl("/show/warehouse/logout")
                                .logoutSuccessUrl("/show/warehouse/logout/success"))

                .build();
    }


}
