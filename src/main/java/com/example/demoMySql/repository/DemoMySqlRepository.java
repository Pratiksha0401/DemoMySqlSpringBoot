package com.example.demoMySql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoMySql.model.User;

public interface DemoMySqlRepository extends JpaRepository<User, Integer>{


}
