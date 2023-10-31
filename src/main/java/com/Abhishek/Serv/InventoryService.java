package com.Abhishek.Serv;

import java.util.List;

import com.Abhishek.model.Inventory;

public interface InventoryService {
	void add(Inventory inventory);
	void modify(Inventory inventory);
	void removeById(int id);
	Inventory getById(int id);
	List<Inventory> getAll();
}
