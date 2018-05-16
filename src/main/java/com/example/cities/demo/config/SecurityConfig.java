//package com.example.cities.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.web.context.request.RequestContextListener;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                    .antMatchers("/cities", "/", "/v2/api-docs", "/swagger-resources/configuration/ui", "/swagger-resources/swagger-ui.html").permitAll()
//                    .anyRequest().authenticated()
//                    .and()
//                .formLogin()
//                    .loginPage("/login")
//                    .permitAll()
//                    .and()
//                .logout()
//                .permitAll();
//    }
//
////    @Bean
////    public RequestContextListener requestContextListener() {
////        return new RequestContextListener();
////    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService () {
//        //this deprecated method not safety, but is okay for getting started (from docs)
//        UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
//        return new InMemoryUserDetailsManager(user);
//    }
//
//}
