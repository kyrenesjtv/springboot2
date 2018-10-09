package com.github.kyrenesjtv.springboot2.springboot2_withsql.quartz.job;

import com.github.kyrenesjtv.springboot2.springboot2_withsql.constant.OperationConstant;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.po.*;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.service.carmon.CarmonService;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.service.gwyc.GwycService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wanglin on 2017/10/21.
 */
@Component //实例化到容器中
public class HelloJob implements Job {

    private static Logger LOGGER = LoggerFactory.getLogger(HelloJob.class);

	@Autowired
	private CarmonService carmonService;

    @Autowired
    private GwycService gwycService;


	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
        List<MonOperationInfo> monOperationInfos = carmonService.queryMonOperationInfo();
        for(int i = 0 ; i <monOperationInfos.size();i++){
            MonOperationInfo monOperationInfo = monOperationInfos.get(i);
            Integer id = monOperationInfo.getId();
            String table_name = monOperationInfo.getTable_name();
            String operation = monOperationInfo.getOperation();
            Integer old_id = monOperationInfo.getOld_id();

            if(OperationConstant.MONCARAPPLYINFO.equals(table_name)){
                MonCarApplyInfo monCarApplyInfo = carmonService.queryMonCarApplyInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonCarApplyInfoByID(monCarApplyInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARAPPLYINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonCarApplyInfoByID(monCarApplyInfo);
                    gwycService.insertMonCarApplyInfoByID(monCarApplyInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARAPPLYINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonCarApplyInfoByID(monCarApplyInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARAPPLYINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONCARBALANCEINFO.equals(table_name)){
                MonCarBalanceInfo monCarBalanceInfo = carmonService.queryMonCarBalanceInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonCarBalanceInfoByID(monCarBalanceInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARBALANCEINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonCarBalanceInfoByID(monCarBalanceInfo);
                    gwycService.insertMonCarBalanceInfoByID(monCarBalanceInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARBALANCEINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonCarBalanceInfoByID(monCarBalanceInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARBALANCEINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONCARDAKAINFO.equals(table_name)){
                MonCarDakaInfo monCarDakaInfo = carmonService.queryMonCarDakaInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonCarDakaInfoByID(monCarDakaInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARDAKAINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonCarDakaInfoByID(monCarDakaInfo);
                    gwycService.insertMonCarDakaInfoByID(monCarDakaInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARDAKAINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonCarDakaInfoByID(monCarDakaInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARDAKAINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONCARINFO.equals(table_name)){
                MonCarInfo monCarInfo = carmonService.queryMonCarInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonCarInfoByID(monCarInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonCarInfoByID(monCarInfo);
                    gwycService.insertMonCarInfoByID(monCarInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonCarInfoByID(monCarInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONCARTYPEINFO.equals(table_name)){
                MonCarTypeInfo monCarTypeInfo = carmonService.queryMonCarTypeInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonCarTypeInfoByID(monCarTypeInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARTYPEINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonCarTypeInfoByID(monCarTypeInfo);
                    gwycService.insertMonCarTypeInfoByID(monCarTypeInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARTYPEINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonCarTypeInfoByID(monCarTypeInfo);
                    LOGGER.info("========= "+OperationConstant.MONCARTYPEINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONUSERINFO.equals(table_name)){
                MonUserInfo monUserInfo = carmonService.queryMonUserInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonUserInfoByID(monUserInfo);
                    LOGGER.info("========= "+OperationConstant.MONUSERINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonUserInfoByID(monUserInfo);
                    gwycService.insertMonUserInfoByID(monUserInfo);
                    LOGGER.info("========= "+OperationConstant.MONUSERINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonUserInfoByID(monUserInfo);
                    LOGGER.info("========= "+OperationConstant.MONUSERINFO +":  "+OperationConstant.DELETE+"ok============");
                }
                carmonService.deleteMonOperationInfoByID(id);
            }else if(OperationConstant.MONDEPARTMENTINFO.equals(table_name)){
                MonDepartmentInfo monDepartmentInfo = carmonService.queryMonDepartmentInfoByID(old_id);
                if(OperationConstant.INSERT.equals(operation)){
                    gwycService.insertMonDepartmentInfoByID(monDepartmentInfo);
                    LOGGER.info("========= "+OperationConstant.MONDEPARTMENTINFO +":  "+OperationConstant.INSERT+"ok============");
                }else if(OperationConstant.UPDATE.equals(operation)){
                    gwycService.deleteMonDepartmentInfoByID(monDepartmentInfo);
                    gwycService.insertMonDepartmentInfoByID(monDepartmentInfo);
                    LOGGER.info("========= "+OperationConstant.MONDEPARTMENTINFO +":  "+OperationConstant.UPDATE+"ok============");
                }else if(OperationConstant.DELETE.equals(operation)){
                    gwycService.deleteMonDepartmentInfoByID(monDepartmentInfo);
                    LOGGER.info("========= "+OperationConstant.MONDEPARTMENTINFO +":  "+OperationConstant.DELETE+"ok============");
                }
            }


        }
    }

}
