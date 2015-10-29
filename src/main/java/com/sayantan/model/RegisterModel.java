package com.sayantan.model;

import javax.persistence.*;

@Entity
@Table(name = "REGISTER_USER")
public class RegisterModel {

	@Id
	@Column(name = "USER_NAME")
	private String uid;

	@Column(name = "USER_PASSCODE")
	private String upass;

	public RegisterModel() {
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the upass
	 */
	public String getUpass() {
		return upass;
	}

	/**
	 * @param upass the upass to set
	 */
	public void setUpass(String upass) {
		this.upass = upass;
	}

}