package com.smart.service;

import com.smart.domain.Forum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath:com/smart/tx/applicationContext.xml"})
@Rollback
@Transactional
public class TestForumService  extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    public ForumService1 forumService1;
    @Test
    public  void testForumService() throws Throwable{
        Forum forum = new Forum();
        forum.setForumDesc("desc");
        forum.setForumName("name");
        forumService1.addForum(forum);

//       ForumService forumService = ctx.getBean(ForumService.class);
//       System.out.println("begin...........");
//       forumService.addTopic();
//       System.out.println("end!!!!!!!!!!!!!");
    }

}
