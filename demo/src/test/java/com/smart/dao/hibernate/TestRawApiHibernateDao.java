package com.smart.dao.hibernate;

import com.smart.dao.hibraw.ForumHibernateDao;
import com.smart.entity.Forum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ContextConfiguration(locations = { "classpath:orm/applicationContext-hbt-raw.xml" })
@Transactional
public class TestRawApiHibernateDao extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ForumHibernateDao forumDao;

    @Test
    public void testAllMethod() {
        Forum forum = forumDao.getForum(1);
        Assert.assertNotNull(forum);

        List<Forum> forums = forumDao.findForumByName("forum");
        Assert.assertTrue(forums.size()>0);
    }

}
