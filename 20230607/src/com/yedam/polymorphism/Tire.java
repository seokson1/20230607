package com.yedam.polymorphism;

// 최대회전수. 누적회전수. 위치.
public class Tire {
	// 필드.
	private int maxRotation;
	private int accumulatedRotation;
	private String location;
	// 생성자.
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	// 메소드.
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println((maxRotation-accumulatedRotation) + "회" + "위치 " + location);
			return true;
		} else {
			System.out.println("타이어 펑크 *** " + "위치 " + location);
			return false;
		}
	}
	//getter seeter
	public int getMaxRotation() {
		return maxRotation;
	}
	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}
	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}
	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
