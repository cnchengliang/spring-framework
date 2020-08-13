package com.smart.ltw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AspectjLtwTest {
    public static void main(String[] args) {
        // LTW（Load Time Weaving）需要在运行时加上spring-instrument-x.RELEASE.jar
        // -javaagent:/Volumes/OS/CommonDisk/spring/spring-framework/spring-instrument/build/libs/spring-instrument-5.3.0-SNAPSHOT.jar
        String configPath = "com/smart/ltw/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter waiter = ctx.getBean(Waiter.class);
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
