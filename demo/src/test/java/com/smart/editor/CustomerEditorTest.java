package com.smart.editor;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class CustomerEditorTest {
    public ApplicationContext ctx = null;

    private static String[] CONFIG_FILES = {"com/smart/editor/beans.xml"};

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testCustomerCarEditor(){
        Boss boss = (Boss) ctx.getBean("boss");
        assertNotNull(boss);
        System.out.println(boss);
    }

}
