package com.programmingtechie.productservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value="product")
public class Product {

    @Id
    private int id;
    private String name;
    private String description;
    private BigDecimal price;

}

