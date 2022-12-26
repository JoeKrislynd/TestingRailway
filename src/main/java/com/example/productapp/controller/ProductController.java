package com.example.productapp.controller;

import com.example.productapp.entity.Product;
import com.example.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/find")
    public List<Product> findAllProduct() {
        return productService.findAllProduct();
    }

    @PostMapping("/add")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

}
