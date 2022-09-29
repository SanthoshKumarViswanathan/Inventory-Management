package com.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.Entity.InventoryDetails;

public interface InventoryRepository extends JpaRepository <InventoryDetails, Integer> {
    
}
