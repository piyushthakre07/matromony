package com.app.module.otp.dao;

import java.util.List;

import com.app.beans.RequestOtpVerificationBean;
import com.app.model.OtpVerification;

public interface IOtpDao {

	public List<OtpVerification> verifyOtpDao(RequestOtpVerificationBean RequestBean);
}
