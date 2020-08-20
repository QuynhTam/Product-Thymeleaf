package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private final static Map<Integer, Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1, new Product(0, "Bphone", 200, 10));
        listProduct.put(2, new Product(1, "Sam Sung", 200, 10));
        listProduct.put(3, new Product(2, "Iphone", 200, 10));
        listProduct.put(4, new Product(3, "OPPO", 200, 10));
        listProduct.put(5, new Product(4, "Asus", 200, 20));
        listProduct.put(6, new Product(5, "LG", 200, 10));
        listProduct.put(7, new Product(6, "HTC", 200, 10));
        listProduct.put(8, new Product(7, "SONY", 200, 1));
        listProduct.put(9, new Product(8, "Xiaomi", 200, 15));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public void add(Product product) {
        listProduct.put(product.getId(), product);
    }

    @Override
    public Product findId(int id) {
        return listProduct.get(id);
    }

    @Override
    public void delete(int id) {
        listProduct.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id, product);
    }
}
