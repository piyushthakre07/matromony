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
@Table(name = "user_other_details")
public class OtherDetails extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = 6827710137298356328L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uod_id")
	private Integer uodId;

	@Column(name = "colour")
	private String colour;
	
	@Column(name = "birth_time")
	private String birthTime;
	
	@Column(name = "birth_day")
	private String birthDay;
	
	@Column(name = "gotra")
	private String gotra;
	
	@Column(name = "kul")
	private String kul;
	
	@Column(name = "birth_place")
	private String birthPlace;
	
	@Column(name = "is_active")
	private String active;
}
