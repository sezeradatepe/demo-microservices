package com.sha.springbootmicroservices1product.service.impl;

import com.sha.springbootmicroservices1product.model.Product;
import com.sha.springbootmicroservices1product.repository.IProductRepository;
import com.sha.springbootmicroservices1product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProduct(){
      return productRepository.findAll();
    }
}
