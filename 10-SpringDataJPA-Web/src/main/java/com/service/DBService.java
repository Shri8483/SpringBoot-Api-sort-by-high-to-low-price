package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class DBService {

	@Autowired
	private ProductRepository productRepository;

	// 1//PageRequest request = PageRequest.of(1, 4);

	/*
	 * PageRequest request = PageRequest.of(0, 4,Sort.by("pcategory"));
	 * Page<Product> page= productRepository.findAll(request);
	 * 
	 * for(Product product:page) { System.out.println(product); }
	 */
	// InsertData();

	private void InsertData() {
		List<Product> pList = Arrays.asList(new Product(107, "Laptop", 40000, "Electronics"),
				new Product(108, "Heater", 50000, "Home-Decor"), new Product(109, "LED", 80000, "Electronics"),
				new Product(110, "Charger", 4000, "Electronics"), new Product(111, "T-shirt", 3000, "Clothing"),
				new Product(112, "Camera", 40000, "Daily-essentials"));

		productRepository.saveAll(pList);
	}

	public List<Product> getAllDetails() {

		return productRepository.findAll();
	}

	public List<Product> getFirstPage() {
		PageRequest request = PageRequest.of(0, 4);
		Page<Product> page = productRepository.findAll(request);
		return page.getContent();
	}

	public List<Product> getLowtoHigh() {
		PageRequest request = PageRequest.of(0, 4, Sort.by("pprice").and(Sort.by("pcategory")));
		Page<Product> page = productRepository.findAll(request);
		return page.getContent();
	}

}
