package com.yedam.abstracts;

public abstract class Dao {

	void start() {
		System.out.println("dbms 시작합니다.");
	}
	void stop() {
		System.out.println("dbms 종료합니다.");
	}
	abstract void add();
	abstract void modify();
	abstract void remove();
}
