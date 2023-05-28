package com.yatin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yatin.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}