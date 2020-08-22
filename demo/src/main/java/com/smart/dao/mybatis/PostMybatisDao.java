package com.smart.dao.mybatis;

import com.smart.entity.Post;

public interface PostMybatisDao{
    void addPost(Post post);
    Post getPost(int postId);
}
