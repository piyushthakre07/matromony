package com.app.module.master.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.model.Temporary;
import com.app.module.master.dao.ITemporaryDao;

public class TemporaryDaoImpl implements ITemporaryDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveTempDetails(Temporary temporary) {
		// TODO Auto-generated method stub
		return false;
	}

}
