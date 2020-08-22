package com.smart.service;

import com.smart.domain.Forum;
import com.smart.service.hibernate.BbtForumSerive;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath:orm/applicationContext-hbt.xml"})
@Transactional
public class TestHibernateBbtForum extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private BbtForumSerive bbtForumSerive;

    @Test
    public void testHibernateInit(){
        Forum forum = new Forum();
        forum.setForumId(99);
        forum.setForumName("name 99");
        forum.setForumDesc("desc");
        bbtForumSerive.addForum(forum);
    }

}
