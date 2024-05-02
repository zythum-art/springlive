package net.nvsoftware.springmonocason.service;

import net.nvsoftware.springmonocason.error.ProductNotFoundException;
import net.nvsoftware.springmonocason.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
    Product getById(String id) throws ProductNotFoundException;
    String deletById(String id);
}
