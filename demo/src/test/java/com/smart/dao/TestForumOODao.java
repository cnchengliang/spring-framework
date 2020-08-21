package com.smart.dao;

import com.smart.domain.Forum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:dao/applicationContext.xml" })
@Rollback
@Transactional
public class TestForumOODao extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ForumOODao forumDao;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testGetForum(){
        jdbcTemplate.execute(" insert into  t_forum(forum_name,forum_desc) "+
                             " values('test','test')");
        int forumId = jdbcTemplate.queryForObject("select max(forum_id) from t_forum",Integer.class);
        Forum forum = forumDao.getForum(forumId);
        System.out.println(forum.getForumName());
    }
    
    @Test
    public void testAddForum(){
        Forum forum = new Forum();
        forum.setForumName("test2");
        forum.setForumDesc("desc 2");
        forumDao.addForum(forum);
    }
    
    @Test
    public void testGetTopicNum(){
        int topicNum = forumDao.getTopicNum(1);
        System.out.println("topicNum:"+topicNum);
    }	

}
