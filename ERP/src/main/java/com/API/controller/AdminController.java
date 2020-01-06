package com.API.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.API.Entity.Carts;
import com.API.Entity.Product;
import com.API.Service.CartsService;
import com.API.Service.ProductServcie;

@Controller
public class AdminController {
	
	@Autowired
	ProductServcie products;
	
	@Autowired
	CartsService cartsService;
	
	@GetMapping("/sales")
	public String getapi() {
		return "Sales";
	}

	
	@ResponseBody
	@CrossOrigin("*")
	@GetMapping("/sales/addToCart")
	public Optional<Product> getProductById(@RequestParam(name = "maSP") int maSP) {
		return products.getProductById(maSP);
	}
	

	@ResponseBody
	@CrossOrigin("*")
	@GetMapping("/sales/saveToCart")
	public boolean insertOneProduct(@RequestBody Product product) {
		products.insertOneProduct(product);
		return true;
	}



	@GetMapping("/warehouse")
	public String Warehouse() {
		return "warehouse";
	}
	
	
	
	@RequestMapping(value = "/sales/insertCart", method = RequestMethod.POST)
	@ResponseBody
	public String insertCart(@RequestBody Carts cart) {
		cartsService.insertCart(cart);
		return "aa";
	}
	
	
	@ResponseBody
	@CrossOrigin("*")
	@RequestMapping("/sales/getAllCart")
	public List<Carts> getAllcart(){
		return cartsService.getAllcart();
	}
	
}
