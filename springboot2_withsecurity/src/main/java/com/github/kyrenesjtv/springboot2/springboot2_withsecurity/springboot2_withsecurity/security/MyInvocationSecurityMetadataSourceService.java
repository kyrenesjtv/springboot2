package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.security;

import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO.RoleDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.RoleFunctionPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Component
public class MyInvocationSecurityMetadataSourceService implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private RoleDAO roleDao;

    /**
     * 每一个资源所需要的角色
     */
    public  static HashMap<String, Collection<ConfigAttribute>> map =null;

    public void loadResourceDefine(){

        map = new HashMap<>();

        //权限资源 和 角色对应的表  也就是 角色 权限中间表
        List<RoleFunctionPO> rolePermissons = roleDao.listAllRoleFunction();

        //每个资源 所需要的权限
        for (RoleFunctionPO rolePermisson : rolePermissons) {
            String url = rolePermisson.getFunctionAddress();
            String roleName = rolePermisson.getRoleName();
            ConfigAttribute role = new SecurityConfig(roleName);
            if(map.containsKey(url)){
                map.get(url).add(role);
            }else{
                map.put(url,new ArrayList<ConfigAttribute>(){{
                    add(role);
                }});
            }
        }
    }

    /**
     * @param object
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if(map ==null){
            loadResourceDefine();
        }
        //object 中包含用户请求的request 信息
        HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
        for(Iterator<String> iter = map.keySet().iterator(); iter.hasNext(); ) {
            String url = iter.next();
            if(new AntPathRequestMatcher(url).matches(request)) {
                return map.get(url);
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
