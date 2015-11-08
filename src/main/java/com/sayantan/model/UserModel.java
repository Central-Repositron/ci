package com.sayantan.model;

import javax.persistence.*;

@Entity
@Table(name = "CRES_USER_LIST")
public class UserModel {

	@Id
	@Column(name = "USER_NAME")
	private String uid;

	@Column(name = "USER_PASSCODE")
	private String upass;

	public UserModel() {
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
