package com.API.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Entity.Carts;

@Transactional
public interface CartsDAO extends JpaRepository<Carts, Integer>{
	
	
}
