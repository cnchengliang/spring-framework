package com.smart.dynamic;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class CustomSchemaTest {
    public ApplicationContext applicationContext = null;

    private static String[] CONFIG_FILES = { "com/smart/dynamic/custom.xml" };

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext(CONFIG_FILES);

    }

    @Test
    public void registerBean(){
        Object userService = applicationContext.getBean("userService");
        assertNotNull(userService);

    }

}
