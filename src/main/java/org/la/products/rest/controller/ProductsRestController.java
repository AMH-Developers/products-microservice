package org.la.products.rest.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.la.products.model.ProductsModel;
import org.la.products.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductsRestController {

	@Autowired
	private ProductsService productsService;
	
	//--------------------------------------------------------------------------findById
	@GetMapping("/findById/{productId}")
	public ProductsModel findById(@PathVariable Long productId) {
		return productsService.findById(productId);
	}
	
	//--------------------------------------------------------------------------findAll
	@GetMapping("/findAll")
	public List<ProductsModel> findAll(){
		return productsService.findAll();
	}
	
	//--------------------------------------------------------------------------Add/Save
	@PostMapping("/add")
	public ProductsModel addProduct(@RequestBody ProductsModel products) {
		return productsService.addProduct(products);
	}
	
	@GetMapping("/quantity/{id}")
	public String findQuantityById(@PathVariable Long id) {
		return productsService.findQuantityById(id);
	}
	
	//--------------------------------------------------------------------------Delete
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable("id") Long id, HttpServletResponse response) {
		productsService.deleteProduct(id);
	}
	
	//--------------------------------------------------------------------------Update
	@PutMapping("/update/{id}")
	public ProductsModel update(@PathVariable("id") Long id, @RequestBody ProductsModel products) {
		return productsService.updateProduct(id, products);

	}
}
