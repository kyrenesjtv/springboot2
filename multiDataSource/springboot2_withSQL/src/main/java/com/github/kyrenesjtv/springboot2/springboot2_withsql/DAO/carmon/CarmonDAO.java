package com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.carmon;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 13:58
 */
public interface CarmonDAO {
    /**
     * 查询操作记录表，insert,update,delete操作
     * @return
     */
    List<MonOperationInfo> queryMonOperationInfo();

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarApplyInfo queryMonCarApplyInfoByID(@Param("id") int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarBalanceInfo queryMonCarBalanceInfoByID(@Param("id")int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarDakaInfo queryMonCarDakaInfoByID(@Param("id")int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarInfo queryMonCarInfoByID(@Param("id")int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarTypeInfo queryMonCarTypeInfoByID(@Param("id")int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonUserInfo queryMonUserInfoByID(@Param("id")int id);

    /**
     * 根据ID查询mon_department_info
     * @param id
     * @return
     */
    MonDepartmentInfo queryMonDepartmentInfoByID(@Param("id")int id);

    /**
     * 根据ID删除monOperationInfo
     * @param id
     */
    void deleteMonOperationInfoByID(@Param("id")int id);
}
