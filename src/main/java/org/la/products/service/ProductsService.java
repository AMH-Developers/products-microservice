package org.la.products.service;


import java.util.List;

import org.la.products.model.ProductsModel;
import org.la.products.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;
		
	//--------------------------------------------------------------------------------------------findById
	public ProductsModel findById(Long productId) {
		ProductsModel productsModel = productsRepository.findById(productId).get();
		 return productsModel;
	}
	
	//---------------------------------------------------------------------------------------------findAll
	public List<ProductsModel> findAll(){
		List<ProductsModel> productsList = productsRepository.findAll();
		return productsList;
	}

	//---------------------------------------------------------------------------------------------Add/Save
	public ProductsModel addProduct(ProductsModel products) {
		return productsRepository.save(products); 
	}

	public void deleteProduct(Long id) {
		productsRepository.deleteById(id);
		
	}

	public ProductsModel updateProduct(Long id,ProductsModel products) {
		ProductsModel pro = productsRepository.findById(id).orElse(null);
		pro.setProductName(products.getProductName());
		pro.setProductCountry(products.getProductCountry());
		products = productsRepository.save(pro);
		return products;
	}

	public String findQuantityById(Long id) {
		ProductsModel prod = productsRepository.findById(id).get();
		if(prod.getProductQuantity() == 0) {
			return "out of stock";
		}else {
			return "product is available";
	}
 }
	
	
}
