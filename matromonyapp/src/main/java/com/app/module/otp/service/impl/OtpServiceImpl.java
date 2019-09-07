package com.app.module.otp.service.impl;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.beans.RequestOtpVerificationBean;
import com.app.beans.StatusBean;
import com.app.model.OtpVerification;
import com.app.module.otp.dao.IOtpDao;
import com.app.module.otp.iservice.IOtpService;

@Service
public class OtpServiceImpl implements IOtpService {

	@Autowired
	IOtpDao otpDao;

	 public String generateOTP(int length) {
	      String numbers = "1234567890";
	      Random random = new Random();
	      char[] otp = new char[length];

	      for(int i = 0; i< length ; i++) {
	         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
	      }
	     
	      return new String(otp);
	   }

	@Override
	@Transactional
	public StatusBean verifyOtp(RequestOtpVerificationBean requestBean) {
		StatusBean statusBean = new StatusBean();
		List<OtpVerification> otpVerificationList = otpDao.verifyOtpDao(requestBean);

		String message = "";
		if (otpVerificationList == null) {
			message = "Invalid Otp";
			statusBean.setMessage(message);
			statusBean.setSatusCode("400");
			statusBean.setStatus(false);
			statusBean.setErrorCode("1001");
			return statusBean;
		} else {
			message = "Otp Verified!";
			statusBean.setMessage(message);
			statusBean.setSatusCode("200");
			statusBean.setStatus(true);
			return statusBean;

		}
	}


}
