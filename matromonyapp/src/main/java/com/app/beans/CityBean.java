package com.app.beans;

import java.io.Serializable;

/**
 * @author piyush
 *
 */
public class CityBean implements Serializable {

	private static final long serialVersionUID = 6695195154471729772L;
	private Integer cityId;
	private String cityName;
	private String active;
	private String isdefault;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	

}
