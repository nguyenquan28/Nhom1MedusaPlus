package com.API.repository;


import org.springframework.data.repository.CrudRepository;

import com.API.Entity.Role;

public interface RoleSecurityRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}