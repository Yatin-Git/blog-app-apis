package com.yatin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yatin.blog.entities.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
