package eu.codeacademy.skyfly.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers().permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .permitAll()
                .loginPage("/login-skyfly")
                .loginProcessingUrl("/login-skyfly")
                .defaultSuccessUrl("/", true)
                .usernameParameter("loginEmail")
                .passwordParameter("loginPassword");
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().requestMatchers(
                PathRequest.toStaticResources().atCommonLocations(),
                PathRequest.toH2Console()
        );
    }
}
