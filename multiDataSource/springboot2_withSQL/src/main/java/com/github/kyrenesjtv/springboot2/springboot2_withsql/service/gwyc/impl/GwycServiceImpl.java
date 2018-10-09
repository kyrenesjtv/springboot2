package com.github.kyrenesjtv.springboot2.springboot2_withsql.service.gwyc.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.gwyc.GwycDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.service.gwyc.GwycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 15:49
 */
@Service
public class GwycServiceImpl implements GwycService {

    @Autowired
    private GwycDAO gwycDAO;

    @Override
    public void insertMonCarApplyInfoByID(MonCarApplyInfo monCarApplyInfo) {
        gwycDAO.insertMonCarApplyInfoByID(monCarApplyInfo);
    }

    @Override
    public void deleteMonCarApplyInfoByID(MonCarApplyInfo monCarApplyInfo) {
        gwycDAO.deleteMonCarApplyInfoByID(monCarApplyInfo);
    }

    @Override
    public void insertMonCarBalanceInfoByID(MonCarBalanceInfo monCarBalanceInfo) {
        gwycDAO.insertMonCarBalanceInfoByID(monCarBalanceInfo);
    }

    @Override
    public void deleteMonCarBalanceInfoByID(MonCarBalanceInfo monCarBalanceInfo) {
        gwycDAO.deleteMonCarBalanceInfoByID(monCarBalanceInfo);
    }

    @Override
    public void insertMonCarDakaInfoByID(MonCarDakaInfo monCarDakaInfo) {
        gwycDAO.insertMonCarDakaInfoByID(monCarDakaInfo);
    }

    @Override
    public void deleteMonCarDakaInfoByID(MonCarDakaInfo monCarDakaInfo) {
        gwycDAO.deleteMonCarDakaInfoByID(monCarDakaInfo);
    }

    @Override
    public void insertMonCarInfoByID(MonCarInfo monCarInfo) {
        gwycDAO.insertMonCarInfoByID(monCarInfo);
    }

    @Override
    public void deleteMonCarInfoByID(MonCarInfo monCarInfo) {
        gwycDAO.deleteMonCarInfoByID(monCarInfo);
    }

    @Override
    public void insertMonCarTypeInfoByID(MonCarTypeInfo monCarTypeInfo) {
        gwycDAO.insertMonCarTypeInfoByID(monCarTypeInfo);
    }

    @Override
    public void deleteMonCarTypeInfoByID(MonCarTypeInfo monCarTypeInfo) {
        gwycDAO.deleteMonCarTypeInfoByID(monCarTypeInfo);
    }

    @Override
    public void insertMonUserInfoByID(MonUserInfo monUserInfo) {
        gwycDAO.insertMonUserInfoByID(monUserInfo);
    }

    @Override
    public void deleteMonUserInfoByID(MonUserInfo monUserInfo) {
        gwycDAO.deleteMonUserInfoByID(monUserInfo);
    }

    @Override
    public void insertMonDepartmentInfoByID(MonDepartmentInfo monDepartmentInfo) {
        gwycDAO.insertMonDepartmentInfoByID(monDepartmentInfo);
    }

    @Override
    public void deleteMonDepartmentInfoByID(MonDepartmentInfo monDepartmentInfo) {
        gwycDAO.deleteMonDepartmentInfoByID(monDepartmentInfo);
    }
}
