package com.yedam.polymorphism;

public class HanKookTire extends Tire {

	// 생성자.
//	HanKookTire() {
//		super();
//	}
	HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드.
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation() +1);
		if(getAccumulatedRotation()< getMaxRotation()) {
			System.out.println("한국타이어 " + (getMaxRotation() - getAccumulatedRotation())+ "회"+ "위치 " + getLocation());
			return true;
		} else {
			System.out.println("한국타이어 "+ "펑크 *** " + "위치 " + getLocation());
			return false;
		}
	}
}
