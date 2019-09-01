package com.app.model;

import java.io.Serializable;

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
@Table(name = "Education_Level_Master")
public class EducationLevelMaster extends CommonPropertyEntity implements Serializable  {

	private static final long serialVersionUID = -4860194705930657829L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "edu_level_id")
	private Integer eduLevelId;

	@Column(name = "education")
	private String education;
	
	@Column(name = "is_active")
	private String active;
}
