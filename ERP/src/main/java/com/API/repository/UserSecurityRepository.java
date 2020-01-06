package com.API.repository;

import org.springframework.data.repository.CrudRepository;

import com.API.Entity.User;

public interface UserSecurityRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}