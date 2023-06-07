package com.yedam.inherit;

//학교친구: 이름/연락처/학교/전공
public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend() {
		super(); // 부모 클래스 생성자 호출 의미를 가짐.
	}

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
	// getter setter
	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String showInfo() {
		return "이름은 " + getName() + ", " + "연락처 " + getPhone() + 
				", " + "학교는 " + univ + ", " + "전공 " + major;  
	}
}
