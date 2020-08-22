package com.smart.simple;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class BeanRetrieveTest {

    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = {"com/smart/simple/beans.xml"};

    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testBeanRetrieve(){
        Car car = (Car)factory.getBean("#car1");
        assertNotNull(car);
    }
}
