package com.github.kyrenesjtv.springboot2.springboot2_withsql.service.carmon;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 15:11
 */
public interface CarmonService {

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
     MonCarApplyInfo queryMonCarApplyInfoByID(int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarBalanceInfo queryMonCarBalanceInfoByID(int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarDakaInfo queryMonCarDakaInfoByID(int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarInfo queryMonCarInfoByID(int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonCarTypeInfo queryMonCarTypeInfoByID(int id);

    /**
     * 根据ID查询mon_car_apply_info
     * @param id
     * @return
     */
    MonUserInfo queryMonUserInfoByID(int id);

    /**
     * 根据ID查询mon_department_info
     * @param id
     * @return
     */
    MonDepartmentInfo queryMonDepartmentInfoByID(int id);

    /**
     * 根据ID删除monOperationInfo
     * @param id
     */
    void deleteMonOperationInfoByID(int id);

}
