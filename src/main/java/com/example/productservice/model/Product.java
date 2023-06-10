package com.example.productservice.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "PRODDUCT_TABLE")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private Long price;

}