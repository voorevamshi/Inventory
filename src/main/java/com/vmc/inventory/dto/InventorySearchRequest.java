package com.vmc.inventory.dto;

import jakarta.validation.constraints.Min;
import lombok.Data;
@Data
public class InventorySearchRequest {
    private String name;
    private String category;

    @Min(value = 0, message = "Price must be >= 0")
    private Double price;
}
