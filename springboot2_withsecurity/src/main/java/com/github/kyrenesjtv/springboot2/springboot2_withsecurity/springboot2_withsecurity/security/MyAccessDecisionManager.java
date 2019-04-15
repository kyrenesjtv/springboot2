package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Component
public class MyAccessDecisionManager implements AccessDecisionManager {

    private final static Logger logger = LoggerFactory.getLogger(MyAccessDecisionManager.class);

    /**
     * 判定 是否含有权限
     * @param authentication  CustomUserService.loadUserByUsername() 封装的用户信息
     * @param object    request请求信息
     * @param configAttributes InvocationSecurityMetadataSourceService.getAttributes()  中每个资源可访问的角色集合
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {

        if(null== configAttributes || configAttributes.size() <=0) {
            return;
        }
        String needRole;
        List<ConfigAttribute> configAttributes1 = new ArrayList<>();
        configAttributes1.addAll(configAttributes);
        for(Iterator<ConfigAttribute> iter = configAttributes.iterator(); iter.hasNext(); ) {
            needRole = iter.next().getAttribute();
            for(GrantedAuthority ga : authentication.getAuthorities()) {
                logger.info("GrantedAuthority:"+ga.getAuthority().trim());
                if(needRole.trim().equals(ga.getAuthority().trim())) {
                    return;
                }
            }
        }
        throw new AccessDeniedException("no privilege");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

}
