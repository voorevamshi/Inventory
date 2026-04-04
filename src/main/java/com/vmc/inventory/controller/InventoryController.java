package com.vmc.inventory.controller;

import com.vmc.inventory.entity.Inventory;
import com.vmc.inventory.service.InventoryService;
import com.vmc.inventory.dto.InventorySearchRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springdoc.core.annotations.ParameterObject;
@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Validated
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/search")
    public List<Inventory> search(@Valid @ParameterObject InventorySearchRequest request) {
        return service.search(request.getName(), request.getCategory(), request.getPrice());
    }
}
