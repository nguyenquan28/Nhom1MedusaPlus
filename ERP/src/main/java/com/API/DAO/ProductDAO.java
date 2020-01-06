package com.API.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.Entity.Product;

@Transactional
public interface ProductDAO extends JpaRepository<Product, Integer>{

}
