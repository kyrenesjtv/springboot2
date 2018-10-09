package com.github.kyrenesjtv.springboot2.springboot2_withsql.quartz.trigger.simple;//package me.kyrene.springboot4integration.quartz.trigger.simple;
//
//import me.kyrene.springboot4integration.quartz.job.HelloJob;
//import org.quartz.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
///**
// * Created by wanglin on 2018/1/9.
// */
//@Component
//public class SimpleTriggerTest {
//    private final static Logger LOGGER = LoggerFactory.getLogger(SimpleTriggerTest.class);
//
//
//    @Resource(name = "scheduler")
//    private Scheduler scheduler;//如果你想用QuartzScheduleMgr,换一下就好了
//
//    @PostConstruct
//    public void init() {
//        LOGGER.info("加载定时任务开始");
//        try {
//            //Scheduler scheduler = schedulerBean.getScheduler();
//            TriggerKey triggerKey = TriggerKey.triggerKey("quartz-lxh", Scheduler.DEFAULT_GROUP);
//            SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).withRepeatCount(3);//隔10S总执行三次，但是项目启动也会启动一次
//            SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).withSchedule(simpleScheduleBuilder).build();
//            JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withDescription("Hello定时器").withIdentity("hello-job", Scheduler.DEFAULT_GROUP).build();
//            jobDetail.getJobDataMap().put("name", "quartz-lxh");
//
//            scheduler.scheduleJob(jobDetail, trigger);
//        } catch (Exception e) {
//            LOGGER.info("定时任务加载失败，请手动加载！\n");
//            LOGGER.info("定时任务加载异常:", e);
//        }
//        LOGGER.info("加载定时任务结束");
//    }
//}
