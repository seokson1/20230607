package com.yedam.inherit;

public class CellPhone extends Object  { //Object 상속 되어 있음 이미. 없어도

	private String model;
	private String color;

	public CellPhone() {
	}

	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// getter setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice( ) {
		System.out.println("메세지를 전송.");
	}
	public void receiveVoice() {
		System.out.println("메세지 수신.");
	}
}
