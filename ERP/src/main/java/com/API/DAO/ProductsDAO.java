package com.API.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.API.Entity.Product;

@Transactional
public interface ProductsDAO extends JpaRepository<Product, Integer>{

}
