package com.example.productsapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
}