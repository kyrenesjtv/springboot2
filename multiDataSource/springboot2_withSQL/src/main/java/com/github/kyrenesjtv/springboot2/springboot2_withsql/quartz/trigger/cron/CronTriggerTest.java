package com.github.kyrenesjtv.springboot2.springboot2_withsql.quartz.trigger.cron;
import com.github.kyrenesjtv.springboot2.springboot2_withsql.quartz.job.HelloJob;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


/**
 * Created by wanglin on 2017/10/21.
 */
@Component//加载到spring容器中 作为一个bean
public class CronTriggerTest {


	@Resource(name = "scheduler")
	private Scheduler scheduler;

	@PostConstruct
	public void init() {//项目启动启动
		try {
			//Scheduler scheduler = schedulerBean.getScheduler();
			TriggerKey triggerKey = TriggerKey.triggerKey("quartz-albert", Scheduler.DEFAULT_GROUP);
			CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0 0/5 * * * ?");//每隔5min执行,项目启动时候也会立马执行一次
			CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
			JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withDescription("Hello定时器").withIdentity("hello-job", Scheduler.DEFAULT_GROUP).build();
			jobDetail.getJobDataMap().put("name", "quartz-albert");

			scheduler.scheduleJob(jobDetail, trigger);
		} catch (Exception e) {
		}

	}
}
