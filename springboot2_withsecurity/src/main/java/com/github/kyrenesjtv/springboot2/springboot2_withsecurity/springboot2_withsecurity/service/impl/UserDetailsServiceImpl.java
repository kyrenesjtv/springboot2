package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.service.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO.RoleDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO.UserDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.RolePO;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: dingDang
 * @Author: wanglin
 * @CreateDate: 2019/4/1 16:56
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String id = userDAO.getUserIdByUserName(s);
        UserPO user = userDAO.getUserById(id);
        if(user == null){
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", s));
        }

        List<RolePO> rolePOS = roleDAO.listRolesByUserId(id);
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RolePO role : rolePOS) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new User(user.getLoginName(), user.getPassword(), authorities);
    }
}
