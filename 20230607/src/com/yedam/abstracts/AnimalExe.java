package com.yedam.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		// 추상 클래스 -> 실체 클래스. (할 수 없음)
		Animal animal = null;  //new Animal(); -> 만들수 없음. 추상 클래스로 인스턴스 생성 불가.
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		Animal animal2 = null;
		animal2 = new Cat();
		animal2.breathe();
		animal2.sound();
		
		
		Bird bird = new Bird();
		bird.breathe();
		bird.sound();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		
		
	}
}
