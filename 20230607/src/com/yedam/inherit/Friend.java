package com.yedam.inherit;

public class Friend {
	// fields.
	private String name;
	private String phone;

	// constructor
	public Friend() {
	}

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String showInfo() {
		return "이름은 " + name + ", " + "연락처 " + phone;
	}
}
