package com.smart.groovy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LogonServiceTest {

    @Test
    public  void getBean(){
        ApplicationContext ctx = new GenericGroovyApplicationContext("classpath:com/smart/groovy/spring-context.groovy");
        LogDao logDao = ctx.getBean(LogDao.class);

        LogonService logonService = ctx.getBean(LogonService.class);
        assertNotNull(logonService);

        MailService mailService = ctx.getBean(MailService.class);
        assertNotNull(mailService);

        UserDao userDao = ctx.getBean(UserDao.class);
        assertTrue(userDao instanceof DbUserDao);


    }
}
