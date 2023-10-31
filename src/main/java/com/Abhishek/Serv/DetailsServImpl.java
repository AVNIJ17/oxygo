package com.Abhishek.Serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Abhishek.dao.DetailsDao;
import com.Abhishek.model.Details;
@Service
public class DetailsServImpl implements DetailsServ{
@Autowired
private DetailsDao detDao;
	@Override
	public void add(Details details) {
		detDao.save(details);
	}

}
