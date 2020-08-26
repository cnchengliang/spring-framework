package com.smart.timer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.Timer;


@ContextConfiguration(locations = {"classpath:quartz/applicationContext-timer.xml"})
public class TestTimerScheduler {

    @Autowired
    private Timer timer;

    @Test
    public void testScheduler() throws Throwable{
        System.out.println("begin...");
        Thread.currentThread().sleep(10000);
        System.out.println("end.");
    }
}
