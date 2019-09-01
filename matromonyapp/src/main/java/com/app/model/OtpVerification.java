package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Table(name = "OTPVERIFICATION")
public class OtpVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "otp_verification_id")
	private Integer otpVerificationId;
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "is_verified")
	private String isVerified;
	
	@Column(name = "otp")
	private String otp;
	
	@Column(name = "otp_sending_time")
	private Date otpSendingTime;
	
	@Column(name = "otp_expiring_time")
	private Date otpExpiringTime;
	
	@Column(name = "count")
	private Integer count;
	
	@Column(name = "functionality")
	private String functionality;


}
