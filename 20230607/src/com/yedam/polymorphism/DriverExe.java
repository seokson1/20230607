package com.yedam.polymorphism;

public class DriverExe {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		// 부모 변수유형 = 자식인스턴스.
		Driver driver = new Driver();
		driver.drive(vehicle);
		driver.drive(taxi);
		driver.drive(bus);
		
	}
}
