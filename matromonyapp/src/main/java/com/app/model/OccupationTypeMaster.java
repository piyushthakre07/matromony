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
@Table(name = "Occupationtype_Master")
public class OccupationTypeMaster extends CommonPropertyEntity implements Serializable  {

	private static final long serialVersionUID = -2810217600289418412L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "occupationtype_id")
	private Integer occupationtypeId;

	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "is_active")
	private String active;
}
