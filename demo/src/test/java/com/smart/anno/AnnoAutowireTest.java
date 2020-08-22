package com.smart.anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;


public class AnnoAutowireTest{
    public ApplicationContext factory = null;
    private static String[] CONFIG_FILES = { "com/smart/anno/beans.xml" };

    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testAutoByName(){
        Boss boss = (Boss) factory.getBean("boss");
        assertNotNull(boss);
//          System.out.println("boss.office:"+boss.getOffice());
//          System.out.println("boss.title:"+boss.getTitle());
//          System.out.println("boss.car:"+boss.getCar());
    }

}
