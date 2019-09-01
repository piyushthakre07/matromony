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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Educaion")
public class Education extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = 2863662263360216876L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "edu_id")
	private Integer educationId;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "edu_level_id")
	private EducationLevelMaster educationLevelMaster;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cource_id")
	private CourceMaster courceMaster;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Sepciallazation_id")
	private SepciallazationMaster sepciallazationMaster;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id")
	private UniversityMaster university;

	@Column(name = "passing_year")
	private String passingYear;

	@Column(name = "is_active")
	private String active;

	@Column(name = "is_higest_edu")
	private String higestEducation;

	@Column(name = "description")
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userinfo_Id")
	private UserInfo userInfo;

}
