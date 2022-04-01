package com.sha.springbootmicroservices1product.service;

import com.sha.springbootmicroservices1product.model.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);

    void deleteProduct(long product);

    List<Product> findAllProduct();
}
