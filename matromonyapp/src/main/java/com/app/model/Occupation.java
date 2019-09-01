package com.app.model;

import java.io.Serializable;

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
@Table(name = "Occupation")
public class Occupation extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = -1461697816879329426L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "occupation_id")
	private Integer occupationId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "occupationtype_id")
	private OccupationTypeMaster occupationTypeMaster;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "service_type_id")
	private ServiceType serviceType;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "organization_name")
	private String organizationName;
	
	@Column(name = "income_yearly")
	private String incomeYearly;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "is_active")
	private String active;


}
