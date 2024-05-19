package net.nvsoftware.ProductServicecason.service;

import net.nvsoftware.ProductServicecason.entity.ProductEntity;
import net.nvsoftware.ProductServicecason.model.ProductRequest;
import net.nvsoftware.ProductServicecason.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest) {
        ProductEntity productEntity = ProductEntity.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
        productRepository.save(productEntity);
        return productEntity.getId();
    }
}
