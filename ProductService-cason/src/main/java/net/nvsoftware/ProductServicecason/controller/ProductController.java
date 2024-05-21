package net.nvsoftware.ProductServicecason.controller;

import net.nvsoftware.ProductServicecason.model.ProductRequest;
import net.nvsoftware.ProductServicecason.model.ProductResponse;
import net.nvsoftware.ProductServicecason.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest) {
        long id = productService.addProduct(productRequest);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductResponseById(@PathVariable long id) {
        ProductResponse productResponse = productService.getById(id);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
}
