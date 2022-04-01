package com.sha.springbootmicroservices1product.repository;

import com.sha.springbootmicroservices1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product, Long> {

  //  @Query("Select p.productCode from Product as p where p.name = 'ada'")
   // Product findByProductCustomQuery();
}
