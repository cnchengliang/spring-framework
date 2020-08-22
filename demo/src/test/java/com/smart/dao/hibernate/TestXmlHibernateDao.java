package com.smart.dao.hibernate;

import com.smart.entity.Forum;
import com.smart.entity.Post;
import com.smart.entity.Topic;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;

import java.util.List;

@ContextConfiguration(locations = { "classpath:orm/applicationContext-hbt.xml" })
@Transactional
public class TestXmlHibernateDao extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ForumHibernateDao forumDao;

    @Autowired
    private PostHibernateDao postDao;

    @Test
    public void testAddPost() throws Throwable{
        Topic topic = new Topic();
        topic.setTopicId(1);
        Post post = new Post();
        post.setPostId(10);
        post.setPostText("post text...");
        
        Resource resource = new ClassPathResource("temp.jpg");
        byte[] imgFile =FileCopyUtils.copyToByteArray(resource.getFile());
        post.setPostAttach(imgFile);    
        post.setTopic(topic);  
        postDao.addPost(post);
        
    }

    @Test
    public void testFindForumByName() {
       List<Forum> forums = forumDao.findForumByName("forum");
       Assert.assertTrue(forums.size() > 0);
    }



}
