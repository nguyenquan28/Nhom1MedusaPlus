package com.API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.DAO.CartsDAO;
import com.API.Entity.Carts;

@Service
public class CartsService {
	
	@Autowired
	CartsDAO cartsDAO;
	
//	Insert one cart 
	public void insertCart(Carts cart) {
		cartsDAO.save(cart);
	}
	
	public List<Carts> getAllcart(){
		return cartsDAO.findAll();
	}
	
}
