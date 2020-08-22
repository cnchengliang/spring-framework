package com.smart.auto;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class AutowireTest {
    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = { "com/smart/auto/beans.xml" };

    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);

    }

    @Test
    public void testAutoByName(){
        Boss boss = (Boss) factory.getBean("boss");
        assertNotNull(boss);
        System.out.println("boss:"+boss);
    }

}
