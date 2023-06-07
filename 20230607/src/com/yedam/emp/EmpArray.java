package com.yedam.emp;

public class EmpArray extends EmpList {

	Employee[] employees;
	int empNum;

	@Override
	void init() {
		System.out.print("사원수 입력>");
		int num = Integer.parseInt(scn.nextLine()); // "10" -> 10으로 변환 문자열을 정수로 변환
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.printf("%d 사번> ", empNum);
		int no = scn.nextInt();
		System.out.print("이름> ");
		String name = scn.next();
		System.out.print("급여> ");
		int salary = scn.nextInt();
		employees[empNum++] = new Employee(no, name, salary);

	}

	@Override
	String search(int employeeId) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && 
					employees[i].getEmployeeId() == employeeId) {
				return employees[i].getName();
			}
		}
		return null; // 찾는값이 없으면 null값 반환.
	}

	@Override
	void print() {
		for(int i=0; i<employees.length; i++) {
			if(employees[i] != null) {
				System.out.printf("%5d %10s %7d \n",
						employees[i].getEmployeeId(),
						employees[i].getName(),
						employees[i].getSalary());
			}
		}
	}

}
