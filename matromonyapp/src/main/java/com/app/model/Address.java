package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Entity
@Table(name = "Address_Details")
public class Address extends CommonPropertyEntity implements Serializable{

	private static final long serialVersionUID = -4511741552313552464L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer addressId;

	@Column(name = "address")
	private String address;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "city_id")
	private CityMaster cityMaster;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "state_id")
	private StateMaster stateMaster;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "country_id")
	private CountryMaster countryMaster;
	
	@Column(name = "is_active")
	private String active;
	
	@Column(name = "is_current_address")
	private String currentAddress;
	
	@Column(name = "is_permenant_address")
	private String permenantAddress;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userinfo_Id")
	private UserInfo userInfo;
	
	
	
}
