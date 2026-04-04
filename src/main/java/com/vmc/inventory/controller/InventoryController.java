package com.vmc.inventory.controller;

import com.vmc.inventory.entity.Inventory;
import com.vmc.inventory.service.InventoryService;
import com.vmc.inventory.dto.InventorySearchRequest;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springdoc.core.annotations.ParameterObject;

import java.util.List;
import org.springdoc.core.annotations.ParameterObject;
@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Validated
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/search")
    public Page<Inventory> search(@Valid @ParameterObject InventorySearchRequest request,@ParameterObject Pageable pageable) {
        return service.search(request.getName(), request.getCategory(), request.getPrice(),pageable);
    }
}
