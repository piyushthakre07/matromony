package com.app.beans;

import java.io.Serializable;

/**
 * @author piyush
 *
 */
public class ProfileForBean implements Serializable{
	private static final long serialVersionUID = -1276811286782333361L;
	private Integer profileId;
	private String profileName;
	private String active;
	
	public Integer getProfileId() {
		return profileId;
	}
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	
	

}
