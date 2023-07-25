package com.example.productsapi.controller;

import com.example.productsapi.dto.ProductDto;
import com.example.productsapi.entity.Product;
import com.example.productsapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public Product save(@RequestBody ProductDto product) {
        return service.save(product);
    }

    @GetMapping
    public Iterable<Product> getAll() {
        return service.getAll();
    }

}