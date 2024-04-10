package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Product;
import com.service.DBService;

@Controller
public class HomeController {

	@Autowired
	private DBService service;

	@RequestMapping("/")
	public String landingPage() {

		return "index";

	}

	@RequestMapping("/products")
	public String products(Model model) {
		System.out.println("Product method called..!");

		List<Product> pList = service.getAllDetails();

		System.out.println(pList);
		
		model.addAttribute("data",pList);
		return "products";
	}
	
	@RequestMapping("/firstFour")
	public String FirstPage(Model model)
	{
		System.out.println("FirstPage method called..!");
		List<Product> pList = service.getFirstPage();
		System.out.println(pList);
		model.addAttribute("data",pList);
		return "products";		
	}
	
	@RequestMapping("/lowtohigh")
	public String lowtohigh(Model model)
	{
		List<Product> pList = service.getLowtoHigh();
		System.out.println(pList);
		model.addAttribute("data",pList);
		return "products";	
	}
}
