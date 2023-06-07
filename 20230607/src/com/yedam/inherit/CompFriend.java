package com.yedam.inherit;

//  회사친구 - 이름/연락서/회사명/부서 = CompFriend
public class CompFriend extends Friend {
	private String company;
	private String department;

	CompFriend() {
	}

	public CompFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String showInfo() {
		return "이름은 " + getName() + ", " + "연락처 " + getPhone() + ", " + "회사명 " + company + ", 부서 " + department;
	}
}
