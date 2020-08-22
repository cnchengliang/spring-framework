package com.smart.anno;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import static org.junit.Assert.assertEquals;

@ContextConfiguration("classpath*:/com/smart/anno/mycomponent.xml")
public class MyComponentTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void load() {
        MyComponent myComponent = applicationContext.getBean(MyComponent.class);
        assertEquals(myComponent.getPlugins().size(),2);
    }
}
