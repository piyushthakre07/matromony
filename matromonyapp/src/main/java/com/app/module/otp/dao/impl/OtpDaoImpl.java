package com.app.module.otp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.RequestOtpVerificationBean;
import com.app.model.OtpVerification;
import com.app.module.otp.dao.IOtpDao;

@Repository
public class OtpDaoImpl implements IOtpDao {
	@Autowired
	SessionFactory sessionFactory;


	public List<OtpVerification> verifyOtpDao(RequestOtpVerificationBean requestBean) {
		List<OtpVerification> otpVerificationList = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Criteria crit = session.createCriteria(OtpVerification.class);
			crit.add(Restrictions.eq("contactNumber", requestBean.getContactNumber()));
			crit.add(Restrictions.eq("otp", requestBean.getOtp()));
			crit.add(Restrictions.eq("verifiedStatus", false));
			crit.add(Restrictions.eq("active", true));
			otpVerificationList = crit.list();
		} catch (Exception e) {
			return null;
		}
		return otpVerificationList;
	}

}
