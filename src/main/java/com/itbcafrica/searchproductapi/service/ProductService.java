package com.itbcafrica.searchproductapi.service;

import com.itbcafrica.searchproductapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
