package com.smart.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath:com/smart/txt/applicationContext-multi.xml"})
@Rollback
@Transactional
public class TestMultiForumTx extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    public MultiForumService forumService;

    @Test
    public void testMultiForumTx() throws Throwable{
        System.out.println("begin");
        forumService.addTopic(null);
        System.out.println("end");

        System.out.println("begin");
        forumService.updateForum(null);
        System.out.println("end");

    }
}
