package com.smart.event;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailSenderTest{
    public ApplicationContext ctx = null;

    private static String[] CONFIG_FILES = {"com/smart/event/beans.xml"};

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testMailSender() {
       MailSender mailSender = (MailSender)ctx.getBean("mailSender");
       mailSender.sendMail("aaa@bbb.com");
    }
}
