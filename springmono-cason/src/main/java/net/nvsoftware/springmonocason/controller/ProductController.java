package net.nvsoftware.springmonocason.controller;

import net.nvsoftware.springmonocason.model.Product;
import net.nvsoftware.springmonocason.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        productService.save(product);
        return product;
    }
}
