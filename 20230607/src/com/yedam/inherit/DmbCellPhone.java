package com.yedam.inherit;
//CellPhone + 영상시청.

public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone( ) {
		super(); // 부모 클래스의 생성자를 가리킴.
	}
	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	// getter / setter
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel( ) {
		return this.channel;
	}
	// 재정의.
	@Override // 부모가 가진 메소드를 재정의.
	public void powerOn() {
		System.out.println("Dmb 전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("Dmb 전원을 끕니다.");
	}
	@Override
	public String toString() { // 클래스는 Object 클래스 상속 받아서 사용을 하고 있음. -> Object 안에 toString() 들어가 있음.
		return "모델은 " + this.getModel() + ", " + this.getColor();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
