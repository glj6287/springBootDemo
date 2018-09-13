package com.winter.task;
 
import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
 
@Component
@EnableScheduling
@Slf4j
public class ScheduledTest {
 
    //http://cron.qqe2.com/
    @Scheduled(cron="0 0/2 * * * ?")
	//@Scheduled(cron="0/1 * * * * ?") 
	public void executeFileDownLoadTask() {
 
        // 间隔2分钟,执行任务    
        Thread current = Thread.currentThread(); 
        System.out.println("定时任务1:"+current.getId());
        log.info("ScheduledTest.executeFileDownLoadTask 定时任务1:"+current.getId()+ ",name:"+current.getName());
    }
}