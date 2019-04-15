package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.security;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.access.DefaultWebInvocationPrivilegeEvaluator;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Component
public class MyWebInvocationPrivilegeEvaluator extends DefaultWebInvocationPrivilegeEvaluator {

    public MyWebInvocationPrivilegeEvaluator(AbstractSecurityInterceptor securityInterceptor) {
        super(securityInterceptor);
    }

    @Override
    public boolean isAllowed(String uri, Authentication authentication) {
        return super.isAllowed(uri, authentication);
    }

    @Override
    public boolean isAllowed(String contextPath, String uri, String method, Authentication authentication) {
        //重写原来的方法
        Map<String, Collection<ConfigAttribute>> map = MyInvocationSecurityMetadataSourceService.map;
        //先判断url
        List<ConfigAttribute> uri1 = (List<ConfigAttribute>) map.get(uri);
        //再判断角色
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) authentication.getAuthorities();

        if(uri1 == null || uri1.size() == 0){
            return false;
        }
        if(uri1 == null || uri1.size() == 0){
            return false;
        }


        Boolean result = false;
        for(ConfigAttribute c :uri1){
            for(GrantedAuthority g :authorities){
                if(c.getAttribute().equals(g.getAuthority())){
                    result=true;
                }
            }
        }
        return result;
        //下面的注释掉
//        return super.isAllowed(contextPath, uri, method, authentication);

    }
}
