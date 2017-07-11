package com.musicgroup.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.musicgroup.model.Product;
import com.musicgroup.services.ProductService;

@Controller
@RequestMapping("/home")
public class ProductTheSecondPage {

	@Resource
	ProductService productService;
	
	@RequestMapping(value="/addProduct", method = RequestMethod.GET)
	public String showProductForm(){
		return "addForm";	
	}	

	@RequestMapping(value="/addProduct", method = RequestMethod.POST)
	public String addProduct(Product product){
		productService.save(product);
		return "redirect: /MusicApp/home/product/" + product.getCode();
	}	
	
	@RequestMapping(value="/product/{code:.*}", method = RequestMethod.GET)
	public String displayProduct(Model model, @PathVariable("code") String code){
		
		model.addAttribute("product", productService.getProduct(code));
		return "productPage";
	}
}
