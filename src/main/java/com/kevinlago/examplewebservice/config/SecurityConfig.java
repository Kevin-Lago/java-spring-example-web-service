package com.kevinlago.examplewebservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(a ->
                a.antMatchers("/", "/error", "/webjars/**").permitAll()
                        .anyRequest().authenticated()
        ).csrf(c ->
                c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        ).logout(l ->
                l.logoutSuccessUrl("/").permitAll()
        ).exceptionHandling(e ->
                e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
        ).oauth2Login();

        return http.build();
    }
}
