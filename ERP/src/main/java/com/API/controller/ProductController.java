package com.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.API.Entity.Product;
import com.API.Service.ProductServcie;

@RestController
@RequestMapping(value = "/admin")
public class ProductController {
	@Autowired
	ProductServcie productServcie;
	
	@RequestMapping(value = "/getAllProduct")
	public List<Product> getAllProduct(){
		return productServcie.getAllProduct();
	}
	
	@RequestMapping(value = "/selectByName")
	public List<Product> SelectByName(@RequestParam(name = "nameSP") String nameSP){
		return productServcie.SelectByName(nameSP);
	}

}
