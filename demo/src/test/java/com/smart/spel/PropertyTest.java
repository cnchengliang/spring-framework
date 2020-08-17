package com.smart.spel;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;


public class PropertyTest {
    public static ApplicationContext ctx = null;

    private static String[] CONFIG_FILES = { "com/smart/spel/beans.xml" };

    @BeforeClass
    public static void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);

    }

    @Test
    public void testCustomerCarEditor(){
        SystemPropertyBean systemPropertyBean = (SystemPropertyBean)ctx.getBean(SystemPropertyBean.class);
        MyDataSource dataSource = (MyDataSource)ctx.getBean(MyDataSource.class);
        assertNotNull(dataSource);
    }
}
