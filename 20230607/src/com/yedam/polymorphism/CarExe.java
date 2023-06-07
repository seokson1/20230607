package com.yedam.polymorphism;

public class CarExe {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i <= 6; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞윈쪽에 HankookTire 교체.");
				car.frontLeft = new HanKookTire("앞윈쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽에 KumhoTire 교체.");
				car.frontRight = new KumhoTire("앞윈쪽", 11);
				break;
			case 3:
				System.out.println("뒤왼쪽에 HanKookTire 교체.");
				car.backLeft = new HanKookTire("뒤윈쪽", 12);
				break;
			case 4:
				System.out.println("앞오른쪽에 KumhoTire 교체.");
				car.backRight = new KumhoTire("뒤오른쪽", 11);
				break;
			}
			System.out.println("==========================================");
		}
	}
}
