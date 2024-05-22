package net.nvsoftware.ProductServicecason.service;

import net.nvsoftware.ProductServicecason.model.ProductRequest;
import net.nvsoftware.ProductServicecason.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getById(long id);

    void reduceQuantity(long id, long quantity);
}
