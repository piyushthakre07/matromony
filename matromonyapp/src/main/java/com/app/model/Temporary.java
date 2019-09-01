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
@Table(name = "TEMPORARY")
public class Temporary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "temp_id")
	private Integer tempId;
	
	@Column(name= "profile_for")
	private String profileFor;
	
	@Column(name= "f_name")
	private String fName;
	
	@Column(name= "l_name")
	private String lName;
	
	@Column(name= "gender")
	private String gender;
	
	@Column(name= "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name= "contact_number")
	private Integer contactNumber;
	
	@Column(name= "email_id")
	private String emailId;
	
	@Column(name= "user_name")
	private String userName;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "confirm_pasword")
	private String confirmPasword;
	
}
