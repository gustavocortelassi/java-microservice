package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // API REST geralmente não usa CSRF
            .authorizeHttpRequests()
                .anyRequest().authenticated()
            .and()
            .httpBasic() // Ativa autenticação HTTP Basic
            .and()
            .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // Sem sessão
            .and()
            .formLogin().disable(); // REMOVE login de formulário
        return http.build();
    }
}
