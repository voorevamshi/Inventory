package com.vmc.inventory.spec;


import com.vmc.inventory.entity.Inventory;
import org.springframework.data.jpa.domain.Specification;

public class InventorySpecification {

    public static Specification<Inventory> hasName(String name) {
        return (root, query, cb) -> name == null ? null : cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Inventory> hasCategory(String category) {
        return (root, query, cb) -> category == null ? null : cb.equal(root.get("category"), category);
    }

    public static Specification<Inventory> priceGreaterThan(Double price) {
        return (root, query, cb) -> price == null ? null : cb.greaterThanOrEqualTo(root.get("price"), price);
    }
}