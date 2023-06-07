package com.yedam.emp;

import java.util.Scanner;

//  EmpList : EmpArray(배열), EmpArrayList(ArrayList)
public abstract class EmpList {
	
	Scanner scn = new Scanner(System.in);
	
	
	abstract void init(); // 저장공간을 초기화. 배열 = new Employess[10];
						 // ArrayList = new ArrayList(); => 저장공간 생성 하는 걸 init() 이라고 함.
	
	abstract void input(); // 사원정보 입력.
	abstract String search(int employeeId); // 사원정보 조회.
	abstract void print(); // 사원목록 출력.
}
