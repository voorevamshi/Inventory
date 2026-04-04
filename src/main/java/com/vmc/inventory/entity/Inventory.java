package com.vmc.inventory.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    private String name;
    private String category;
    private String subcategory;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
    private String specification;
    private Double price;
    private Integer stock;
    private String seller;
    private String location;
}