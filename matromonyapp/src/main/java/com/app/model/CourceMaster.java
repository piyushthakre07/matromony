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
@Table(name = "Course_Master")
public class CourceMaster extends CommonPropertyEntity implements Serializable  {

	private static final long serialVersionUID = -2810217600289418412L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cource_id")
	private Integer courceId;

	@Column(name = "course")
	private String course;
	
	@Column(name = "is_active")
	private String active;
}
