package com.example.springbootproject.dao;

import com.example.springbootproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer>{

}
