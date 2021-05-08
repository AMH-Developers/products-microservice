package org.la.products.repository;

import org.la.products.model.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository	
public interface ProductsRepository extends JpaRepository<ProductsModel, Long> {

}
