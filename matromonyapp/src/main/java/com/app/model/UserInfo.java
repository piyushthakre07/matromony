package com.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "User_Info")
public class UserInfo extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = -5552897247917455548L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userinfo_Id")
	private Integer userinfoId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "birth_place")
	private String birthPlace; 
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "alternate_number")
	private String alternateNumber;

	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "description")
	private String description;

	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name = "faher_name")
	private String faherName;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "native_place")
	private String nativePlace;
	
	@Column(name = "user_cast")
	private String userCast;
	
	@Column(name = "user_sub_cast")
	private String userSubCast;
	
	@Column(name = "mam_kul")
	private String mamKul;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_Id")
	User user;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "profileId")
	ProfileFor profileFor;
	
	@Column(name = "is_mobile_verify")
	private String mobileVerify;
	
	@Column(name = "is_active")
	private String active;
	

}
