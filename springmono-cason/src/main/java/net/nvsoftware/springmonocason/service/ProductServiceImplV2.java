package net.nvsoftware.springmonocason.service;

import net.nvsoftware.springmonocason.entity.ProductEntity;
import net.nvsoftware.springmonocason.error.ProductNotFoundException;
import net.nvsoftware.springmonocason.model.Product;
import net.nvsoftware.springmonocason.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImplV2 implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        if (product.getProductId() == null) {
            product.setProductId(UUID.randomUUID().toString());
        }
        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(product, productEntity);
        productRepository.save(productEntity);
        return product;
    }

    @Override
    public List<Product> getAll() {
        List<ProductEntity> productEntityList = productRepository.findAll();
        List<Product> productList = productEntityList.stream()
                .map(productEntity -> {
                    Product product = new Product();
                    BeanUtils.copyProperties(productEntity, product);
                    return product;
                }).collect(Collectors.toList());
        return productList;
    }

    @Override
    public Product getById(String id) throws ProductNotFoundException {
        ProductEntity productEntity = productRepository.findById(id).get();
        Product product = new Product();
        BeanUtils.copyProperties(productEntity, product);
        return product;
    }

    @Override
    public String deletById(String id) {
        productRepository.deleteById(id);
        return "Deleted Product with id: " + id;
    }
}
