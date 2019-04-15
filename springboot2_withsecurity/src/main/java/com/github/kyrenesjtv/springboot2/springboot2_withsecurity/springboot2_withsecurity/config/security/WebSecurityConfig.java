package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.config.security;

import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.security.MyFilterSecurityInterceptor;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.security.MyWebInvocationPrivilegeEvaluator;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.service.impl.UserDetailsServiceImpl;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2019/4/14 22:58
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 通过 实现UserDetailService 来进行验证
     */
    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    /**
     * 解决sec:authorize-url无作用
     */
    @Autowired
    private MyWebInvocationPrivilegeEvaluator myWebInvocationPrivilegeEvaluator;



    /**
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        //校验用户
        auth.userDetailsService(userDetailsServiceImpl)
                //校验密码
                .passwordEncoder(new PasswordEncoder() {

                    @Override
                    public String encode(CharSequence rawPassword) {
                        return MD5Util.md5(String.valueOf(rawPassword));
                    }

                    @Override
                    public boolean matches(CharSequence rawPassword, String encodedPassword) {
                        return encodedPassword.equals(MD5Util.md5(String.valueOf(rawPassword)));
                    }
                });
    }


    @Override
    public void configure(WebSecurity web) {
        web.privilegeEvaluator(myWebInvocationPrivilegeEvaluator);
    }


    /**
     * 创建自定义的表单
     * <p>
     * 页面、登录请求、跳转页面等
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login", "/static/**", "/templates/login.html")//允许访问
                .permitAll().anyRequest().authenticated()
                .and().formLogin().loginPage("/login")//拦截后get请求跳转的页面
                //                .loginProcessingUrl("/login/userLogin")
                .defaultSuccessUrl("/init", true)//登录成功之后的跳转Url
                //                .successForwardUrl("/common/init")
                .permitAll()
                //自定义用户名和密码
                //                .usernameParameter("userName")
                //                .passwordParameter("userPassword")
                .failureUrl("/login?error=true")//设置登录有错误返回login页面并进行提示
                .and().logout().invalidateHttpSession(false)//退出的时候清除session
                .permitAll();
        http.headers().frameOptions().sameOrigin();
        //关闭跨域保护？ post 请求开放 , 否则的话要在每一个post提交里面添加 "${_csrf.parameterName}":"${_csrf.token}"
        http.csrf().disable();


    }

}
