package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO;


import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.UserPO;
import org.apache.ibatis.annotations.Param;


/**
 * @ProjectName: springboot2
 * @Author: wanglin
 * @CreateDate: 2018/6/21 18:21
 */
public interface UserDAO {


    String getUserIdByUserName(@Param("username") String username);

    UserPO getUserById(@Param("userId") String userId);


}