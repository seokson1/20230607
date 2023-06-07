package com.yedam.inherit;

public class PhoneApp {
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("Gallexy");
		cell.setColor("White");
		cell.powerOn();
		cell.powerOff();

		DmbCellPhone dmb = new DmbCellPhone();
		dmb.setModel("Gallexy2");
		dmb.setColor("Black");
		dmb.setChannel(100);
		dmb.powerOn();
		dmb.powerOff();

		// 부모클래스의 변수타입 = 자기 클래스의 인스턴스 할당.
		CellPhone cell1 = new DmbCellPhone(); // promotion 자동형변환.
		cell1.setModel("Gallexy2");
		cell1.setColor("Yello");
		// cell1.setChannel(100);

		if (cell1 instanceof DmbCellPhone) { // cell의 변수의 유형이 DmbCellPhone 인스턴스인지 확인. 후 진행해야 오류 발생을 막을 수 있음.
			DmbCellPhone dmb1 = (DmbCellPhone) cell1; // casting 강제로 형변환
			dmb1.setChannel(100);
			dmb1.powerOn();
		}

		// 컴파일 오류는 아니지만 실행 시점에 오류 발생함.
		if (cell instanceof DmbCellPhone) {
			DmbCellPhone dmb2 = (DmbCellPhone) cell;
			dmb2.setChannel(200);
		}

		// (기본 데이터 타입) 변수의 위치에 값 담겨 있음 int double = > Integer(참조), Double
		int num = 20;
		num = new Integer(30); // 30 정수의 값을 담고 있는 인스턴스. 주소 값을 담겠다. 자동 형변환
		// 취소선 : 이런 형식으로 참조변수 만들지 마세요. 표시!
		

	}
}
