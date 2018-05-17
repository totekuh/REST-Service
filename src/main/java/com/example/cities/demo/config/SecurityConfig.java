package com.example.cities.demo.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.web.context.request.RequestContextListener;


@Configuration
@EnableWebSecurity
//@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/resources","/cities", "/").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .permitAll()
                    .and()
                .logout()
                .permitAll();
    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

//    @Bean
//    public TokenStore tokenStore() {
//        return new JwtTokenStore(accessTokenConverter());
//    }
//
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        converter.setSigningKey("test");
//        return converter;
//    }
//
//    @Bean
//    @Primary
//    public DefaultTokenServices tokenServices() {
//        DefaultTokenServices tokenServices = new DefaultTokenServices();
//        tokenServices.setTokenStore(tokenStore());
//        tokenServices.setSupportRefreshToken(true);
//        return tokenServices;
//    }

}
