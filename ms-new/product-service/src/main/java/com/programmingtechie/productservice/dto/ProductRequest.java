package com.programmingtechie.productservice.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data

public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
