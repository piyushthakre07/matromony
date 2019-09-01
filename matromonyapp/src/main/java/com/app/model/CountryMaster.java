package com.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
@Entity
@Table(name = "COUNTRYMASTER")
public class CountryMaster extends CommonPropertyEntity implements Serializable{

	private static final long serialVersionUID = 8787518967743911148L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Integer countryId;

	@Column(name = "country_name")
	private String countryName;

	@Column(name = "is_active")
	private String active;

	@Column(name = "is_default")
	private String isdefault;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "countryMaster")
	List<StateMaster> StateMasterList;

}
