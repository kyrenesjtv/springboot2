package com.github.kyrenesjtv.springboot2.springboot2_withsql.service.gwyc;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 15:11
 */
public interface GwycService {

    /**
     * 插入monCarApplyInfo
     * @param monCarApplyInfo
     */
    void insertMonCarApplyInfoByID(MonCarApplyInfo monCarApplyInfo);

    /**
     * 删除monCarApplyInfo
     * @param monCarApplyInfo
     */
    void deleteMonCarApplyInfoByID(MonCarApplyInfo monCarApplyInfo);

    /**
     * 插入monCarBalanceInfo
     * @param monCarBalanceInfo
     */
    void insertMonCarBalanceInfoByID(MonCarBalanceInfo monCarBalanceInfo);

    /**
     * 删除monCarBalanceInfo
     * @param monCarBalanceInfo
     */
    void deleteMonCarBalanceInfoByID(MonCarBalanceInfo monCarBalanceInfo);


    /**
     * 插入monCarDakaInfo
     * @param monCarDakaInfo
     */
    void insertMonCarDakaInfoByID(MonCarDakaInfo monCarDakaInfo);

    /**
     * 删除monCarDakaInfo
     * @param monCarDakaInfo
     */
    void deleteMonCarDakaInfoByID(MonCarDakaInfo monCarDakaInfo);


    /**
     * 插入monCarInfo
     * @param monCarInfo
     */
    void insertMonCarInfoByID(MonCarInfo monCarInfo);

    /**
     * 删除monCarInfo
     * @param monCarInfo
     */
    void deleteMonCarInfoByID(MonCarInfo monCarInfo);


    /**
     * 插入monCarTypeInfo
     * @param monCarTypeInfo
     */
    void insertMonCarTypeInfoByID(MonCarTypeInfo monCarTypeInfo);

    /**
     * 删除monCarTypeInfo
     * @param monCarTypeInfo
     */
    void deleteMonCarTypeInfoByID(MonCarTypeInfo monCarTypeInfo);

    /**
     * 插入monUserInfo
     * @param monUserInfo
     */
    void insertMonUserInfoByID(MonUserInfo monUserInfo);

    /**
     * 删除monUserInfo
     * @param monUserInfo
     */
    void deleteMonUserInfoByID(MonUserInfo monUserInfo);


    /**
     * 插入MonDepartmentInfo
     * @param monDepartmentInfo
     */
    void insertMonDepartmentInfoByID(MonDepartmentInfo monDepartmentInfo);

    /**
     * 删除MonDepartmentInfo
     * @param monDepartmentInfo
     */
    void deleteMonDepartmentInfoByID(MonDepartmentInfo monDepartmentInfo);



}
