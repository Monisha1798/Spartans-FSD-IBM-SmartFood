package com.example.shared;

import com.example.entity.CustomerPhysical;

public class CustomerAccountDto {

	private String name;
	private String email;
	private String phone;
	private String password;
	private String passwordBcrypt;
	private CustomerPhysical cp;

	public CustomerAccountDto(CustomerPhysical cp, String passwordBcrypt, String password, String name, String email,
			String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.passwordBcrypt = passwordBcrypt;
		this.cp = cp;
	}

	public CustomerPhysical getCp() {
		return cp;
	}

	public void setCp(CustomerPhysical cp) {
		this.cp = cp;
	}

	public CustomerAccountDto() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordBcrypt() {
		return passwordBcrypt;
	}

	public void setPasswordBcrypt(String passwordBcrypt) {
		this.passwordBcrypt = passwordBcrypt;
	}

}
