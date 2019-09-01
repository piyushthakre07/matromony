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
@Table(name = "User_Details")
public class Relatives extends CommonPropertyEntity implements Serializable{

	private static final long serialVersionUID = 8768554199124200291L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "relative_id")
	private Integer relativeId;

	@Column(name = "relative_name")
	private String relativeName;
	
	@Column(name = "native_place")
	private String nativePlace;
	
	@Column(name = "mul_gav")
	private String mulGav;
	
	@Column(name = "is_marriaged")
	private String marriage;
	
	@Column(name = "other_details")
	private String otherDetails;
	
	@Column(name = "is_active")
	private String active;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userinfo_Id")
	private UserInfo userInfo;
	
	
}
