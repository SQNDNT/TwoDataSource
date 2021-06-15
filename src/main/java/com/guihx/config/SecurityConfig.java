package com.guihx.config;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()//认证请求
                .antMatchers("/").permitAll()//首页路径所有人都能访问
                .antMatchers("/vip").hasRole("vip");//vip路径需要vip权限才能访问
        http.formLogin();
        http.logout();
    }
}
