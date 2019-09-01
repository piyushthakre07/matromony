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
@Getter @Setter @ToString
@Entity
@Table(name = "STATE_MASTER")
public class StateMaster extends CommonPropertyEntity implements Serializable{

	private static final long serialVersionUID = 1232338944575220277L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id")
	private Integer stateId;

	@Column(name = "state_name")
	private String stateName;

	@Column(name = "is_active")
	private String active;

	@Column(name = "is_default")
	private String isdefault;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "country_Id")
	private CountryMaster countryMaster;

}
