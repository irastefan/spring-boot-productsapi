package com.example.productsapi.service;

import com.example.productsapi.dto.ProductDto;
import com.example.productsapi.entity.Product;
import com.example.productsapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(ProductDto productDto) {
        Product product = new Product()
                .setName(productDto.getName())
                .setDescription(productDto.getDescription())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return productRepository.save(product);
    }

    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

}