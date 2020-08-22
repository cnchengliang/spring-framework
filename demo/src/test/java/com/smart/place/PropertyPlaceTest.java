package com.smart.place;

import com.smart.editor.Car;
import com.smart.placeholder.MyDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;


public class PropertyPlaceTest{
    public ApplicationContext ctx = null;

    private static String[] CONFIG_FILES = { "com/smart/place/beans.xml" };

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);

    }

    @Test
    public void testCustomerCarEditor(){
        MyDataSource dataSource = (MyDataSource)ctx.getBean(MyDataSource.class);
        assertNotNull(dataSource);
    }
}
