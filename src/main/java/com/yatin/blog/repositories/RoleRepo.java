package com.yatin.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yatin.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}