package com.github.kyrenesjtv.springboot2.springboot2_withsql.service.carmon.impl;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.DAO.carmon.CarmonDAO;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.service.carmon.CarmonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: springboot2_withsql
 * @Author: wanglin
 * @CreateDate: 2018/9/29 15:49
 */
@Service
public class CarmonServiceImpl implements CarmonService {

    @Autowired
    private CarmonDAO carmonDAO;


    @Override
    public List<MonOperationInfo> queryMonOperationInfo() {
        return carmonDAO.queryMonOperationInfo();
    }

    @Override
    public MonCarApplyInfo queryMonCarApplyInfoByID(int id) {
        return carmonDAO.queryMonCarApplyInfoByID(id);
    }

    @Override
    public MonCarBalanceInfo queryMonCarBalanceInfoByID(int id) {
        return carmonDAO.queryMonCarBalanceInfoByID(id);
    }

    @Override
    public MonCarDakaInfo queryMonCarDakaInfoByID(int id) {
        return carmonDAO.queryMonCarDakaInfoByID(id);
    }

    @Override
    public MonCarInfo queryMonCarInfoByID(int id) {
        return carmonDAO.queryMonCarInfoByID(id);
    }

    @Override
    public MonCarTypeInfo queryMonCarTypeInfoByID(int id) {
        return carmonDAO.queryMonCarTypeInfoByID(id);
    }

    @Override
    public MonUserInfo queryMonUserInfoByID(int id) {
        return carmonDAO.queryMonUserInfoByID(id);
    }

    @Override
    public MonDepartmentInfo queryMonDepartmentInfoByID(int id) {
        return carmonDAO.queryMonDepartmentInfoByID(id);
    }

    @Override
    public void deleteMonOperationInfoByID(int id) {
        carmonDAO.deleteMonOperationInfoByID(id);
    }
}
