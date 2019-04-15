package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.DAO;

import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.RoleFunctionPO;
import com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po.RolePO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: dingDang_blackBox
 * @Author: AlbertW
 * @CreateDate: 2019/3/20 18:19
 */
public interface RoleDAO {


    /**
     * 查询所有的角色和权限
     *
     * @return
     */
    List<RoleFunctionPO> listAllRoleFunction();


    List<RolePO> listRolesByUserId(@Param("userId") String userId);

}

