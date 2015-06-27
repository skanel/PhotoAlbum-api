package com.brahalla.PhotoAlbum.model.json;

import com.brahalla.PhotoAlbum.model.base.CommonModelBase;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AccountInfo extends CommonModelBase {

	private static final long serialVersionUID = 6624726180748515507L;
	private String username;
	private String password;

	public AccountInfo() {
		super();
	}

	public AccountInfo(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	@NotEmpty
	@Length(max = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotEmpty
	@Length(max = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}