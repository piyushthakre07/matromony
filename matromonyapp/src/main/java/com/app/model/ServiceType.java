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
@Table(name = "Service_Type")
public class ServiceType extends CommonPropertyEntity implements Serializable {

	private static final long serialVersionUID = -4860194705930657829L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_type_id")
	private Integer serviceTypeId;

	@Column(name = "service_name")
	private String serviceName;

	@Column(name = "is_active")
	private String active;
}
