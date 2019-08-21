
package com.hiring.dto;

public class UserDTO {
	private String username;
	private String password;
	private String email;
	private String roleId;
	private int isFirstTime;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public int getIsFirstTime() {
		return isFirstTime;
	}

	public void setIsFirstTime(int isFirstTime) {
		this.isFirstTime = isFirstTime;
	}
	
	
}