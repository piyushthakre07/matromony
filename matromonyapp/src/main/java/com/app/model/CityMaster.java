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
@Table(name = "CITY_MASTER")
public class CityMaster extends CommonPropertyEntity implements Serializable{

	private static final long serialVersionUID = -2680179039971003759L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer cityId;

	@Column(name = "city_name")
	private String cityName;
	
	@Column(name = "is_active")
	private String active;

	@Column(name = "is_default")
	private String isdefault;

}
