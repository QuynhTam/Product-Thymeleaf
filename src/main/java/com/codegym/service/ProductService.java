package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void add(Product product);

    Product findId(int id);

    void delete(int id);

    void update(int id, Product product);
}
