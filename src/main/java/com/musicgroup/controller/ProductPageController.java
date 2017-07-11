package com.musicgroup.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.musicgroup.services.ProductService;

@Controller
@RequestMapping("/")
public class ProductPageController {

	@Resource
	ProductService productService;

	@RequestMapping(value="/product/{code:.*}", method = RequestMethod.GET)
	public String displayProduct(Model model, @PathVariable("code") String code){

		model.addAttribute("product", productService.getProduct(code));
		return "productPage";
	}

	@RequestMapping(value="/products", method = RequestMethod.GET)
	public String displayProducts(Model model){

		model.addAttribute("products", productService.getAllProducts());
		return "productPage";
	}
}
