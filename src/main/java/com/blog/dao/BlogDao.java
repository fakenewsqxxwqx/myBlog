package com.blog.dao;

import com.blog.pojo.Blog;
import com.blog.pojo.BlogAndTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BlogDao {

    Blog getBlog(Long id);

    Blog getDetailedBlog(@Param("id") Long id);

    List<Blog> getAllBlog();

    List<Blog> getByTypeId(Long typeId);

    List<Blog> getByTagId(Long tagId);

    List<Blog> getIndexBlog();

    List<Blog> getAllRecommendBlog();

    List<Blog> getSearchBlog(String query);

    List<Blog> searchAllBlog(Blog blog);

    List<String> findGroupYear();

    List<Blog> findByYear(@Param("year") String year);

    int saveBlog(Blog blog);

    int saveBlogAndTag(BlogAndTag blogAndTag);

    int updateBlog(Blog blog);

    int deleteBlog(Long id);

}
