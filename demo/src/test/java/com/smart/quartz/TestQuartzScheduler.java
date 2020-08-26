package com.smart.quartz;

import org.junit.Test;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:quartz/applicationContext-quartz.xml"})
public class TestQuartzScheduler extends AbstractTransactionalJUnit4SpringContextTests {

    private Scheduler scheduler;

    @Autowired
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }



    @Test
    public void testScheduler() throws Throwable{
        System.out.println("begin...");
        scheduler.start();
        Thread.currentThread().sleep(10000);
        System.out.println("end.");
    }
}
