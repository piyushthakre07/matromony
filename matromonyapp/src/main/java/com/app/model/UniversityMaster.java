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

@Getter
@Setter
@ToString
@Entity
@Table(name = "University_Master")
public class UniversityMaster extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = -4555812495948229186L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private Integer universityId;

	@Column(name = "university_name")
	private String universityName;

	@Column(name = "is_active")
	private String active;
}
