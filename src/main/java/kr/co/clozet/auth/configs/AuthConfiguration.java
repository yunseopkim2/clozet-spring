package kr.co.clozet.auth.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * packageName: kr.co.clozet.config
 * fileName        : WebSecurityConfig
 * author           : kimyunseop
 * date               : 2022-05-23
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-05-23   kimyunseop   최초 생성
 */
@Configuration
public class AuthConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(HttpMethod.OPTIONS, "*/**")
                .antMatchers("/");
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); //csrf 무력화
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests()
                .antMatchers("/users/join").permitAll()
                .antMatchers("/users/login").permitAll()
                .anyRequest().authenticated();
        http.exceptionHandling().accessDeniedPage("/users/join");
    }
}