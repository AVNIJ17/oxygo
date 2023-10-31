package com.Abhishek.Serv;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Abhishek.dao.InventoryDao;
import com.Abhishek.model.Inventory;
@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryDao inventDao;

	@Override
	public void add(Inventory inventory) {
		inventDao.save(inventory);
	}

	@Override
	public void modify(Inventory inventory) {
		inventDao.save(inventory);
	}

	@Override
	public void removeById(int id) {
		inventDao.deleteById(id);
	}

	@Override
	public Inventory getById(int id) {
		Optional<Inventory> opt= inventDao.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Inventory> getAll() {
		Iterable<Inventory> itr=inventDao.findAll();
		List<Inventory> lst=new ArrayList<Inventory>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}

}
