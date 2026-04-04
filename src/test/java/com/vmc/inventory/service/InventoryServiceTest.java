
package com.vmc.inventory.service;

import com.vmc.inventory.entity.Inventory;
import com.vmc.inventory.repository.InventoryRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {

    @Mock
    private InventoryRepository repository;

    @InjectMocks
    private InventoryService service;

    public InventoryServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSearch() {

            Inventory inv = Inventory.builder()
                    .name("Test")
                    .category("Electronics")
                    .price(100.0)
                    .build();

            when(repository.findAll((Specification<Inventory>) any(), any(Pageable.class)))
                    .thenReturn(new PageImpl<>(List.of(inv)));

            Page<Inventory> result = service.search(
                    "Test",
                    "Electronics",
                    100.0,
                    PageRequest.of(0, 10)
            );

            assertEquals(1, result.getTotalElements());

            verify(repository, times(1))
                    .findAll((Specification<Inventory>) any(), any(Pageable.class));
            }
}
