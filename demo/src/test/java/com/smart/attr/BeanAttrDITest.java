package com.smart.attr;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BeanAttrDITest {

    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = { "com/smart/attr/beans.xml" };

    @Before
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testBeanRetrieveCar() {
        Car car = (Car) factory.getBean("car");
        assertNotNull(car);
        System.out.println(""+car);
    }

    @Test
    public void testBeanRetrieveBoss() {
        Boss boss1 = (Boss) factory.getBean("boss1");
        Boss boss2 = (Boss) factory.getBean("boss2");
        assertTrue(boss1.getCar() == boss2.getCar());
    }

    @Test
    public void testBeanRetrieveBoss3() {
        Boss boss3 = (Boss) factory.getBean("boss3");
        assertNotNull(boss3.getCar().getBrand());
    }

    @Test
    public void testBeanRetrieveBoss1() {
        Boss boss1 = (Boss) factory.getBean("boss1");
        assertNotNull(boss1);
        System.out.println("boss1:"+boss1);
    }

    @Test
    public void testBeanRetrieveChildBoss() {
        Boss childBoss = (Boss) factory.getBean("childBoss");
        assertNotNull(childBoss);
        System.out.println("childBoss:"+childBoss);
    }

    @Test
    public void testCascadeAttr(){
        SportsCar sportsCar = (SportsCar)factory.getBean("sportsCar");
        System.out.println(sportsCar.getBrand());
    }

}
