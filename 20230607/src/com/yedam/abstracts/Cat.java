package com.yedam.abstracts;

public class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
	@Override
	void breathe() {
		System.out.println("고양이가 숨을 쉽니다.");
	}
}
