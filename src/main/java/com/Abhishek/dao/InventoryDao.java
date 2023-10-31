package com.Abhishek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Abhishek.model.Inventory;
@Repository
public interface InventoryDao extends JpaRepository<Inventory, Integer> {
	
}
