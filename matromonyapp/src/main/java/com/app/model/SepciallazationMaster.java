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
@Table(name = "Sepciallazation_Master")
public class SepciallazationMaster extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = 4666752429021975294L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sepciallazation_id")
	private Integer sepciallazationId;

	@Column(name = "sepciallazation")
	private String sepciallazation;
	
	@Column(name = "is_active")
	private String active;
}
