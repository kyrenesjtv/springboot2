package com.github.kyrenesjtv.springboot2.springboot2_withsql.quartz.config;

import org.quartz.Scheduler;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by wanglin on 2017/10/21.
 */
@Configuration//在spring容器启动的时候加载
public class QuartzConfigration {
	/**
	 * 定义quartz调度工厂
	 * @return
	 */
//	@Bean(name = "scheduler")
//	public SchedulerFactoryBean schedulerFactory() {  
//		SchedulerFactoryBean bean = new SchedulerFactoryBean();  
//        // 用于quartz集群,QuartzScheduler 启动时更新己存在的Job  
//        bean.setOverwriteExistingJobs(true);  
//        // 延时启动，应用启动1秒后  
//        bean.setStartupDelay(1);  
//        return bean;  
//	}
	
	@Bean(name = "scheduler")
    public Scheduler scheduler(QuartzJobFactory quartzJobFactory) throws Exception {
        SchedulerFactoryBean factoryBean=new SchedulerFactoryBean();
        factoryBean.setJobFactory(quartzJobFactory);
        factoryBean.afterPropertiesSet();
        Scheduler scheduler=factoryBean.getScheduler();
        scheduler.start();
        return scheduler;
    }
	
	//解决Job中注入Spring Bean为null的问题
    @Component("quartzJobFactory")
    private class QuartzJobFactory extends AdaptableJobFactory {
        //这个对象Spring会帮我们自动注入进来,也属于Spring技术范畴.
        @Autowired
        private AutowireCapableBeanFactory capableBeanFactory;

        @Override
        protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
            //调用父类的方法
            Object jobInstance = super.createJobInstance(bundle);
            //进行注入,这属于Spring的技术,不清楚的可以查看Spring的API.
            capableBeanFactory.autowireBean(jobInstance);
            return jobInstance;
        }
    }

}
