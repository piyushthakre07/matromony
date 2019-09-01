package com.app.module.master.service.impl;

import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.beans.TemporaryBean;
import com.app.model.Temporary;
import com.app.module.master.dao.ITemporaryDao;
import com.app.module.master.service.ITemporaryService;
@Service
public class TemporaryServiceImpl implements ITemporaryService {

	@Autowired
	ITemporaryDao temporaryDao;

	@Transactional
	public boolean saveTempDetails(TemporaryBean temporaryBean) {
		try {
			Temporary temporary = new Temporary();
			BeanUtils.copyProperties(temporary, temporaryBean);
			temporaryDao.save(temporary);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
