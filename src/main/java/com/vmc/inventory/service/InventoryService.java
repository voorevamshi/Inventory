package com.vmc.inventory.service;


import com.vmc.inventory.entity.Inventory;
import com.vmc.inventory.repository.InventoryRepository;
import com.vmc.inventory.spec.InventorySpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;

    public List<Inventory> search(String name, String category, Double price) {

        Specification<Inventory> spec = Specification
                .where(InventorySpecification.hasName(name))
                .and(InventorySpecification.hasCategory(category))
                .and(InventorySpecification.priceGreaterThan(price));

        return repository.findAll(spec);
    }
}