package com.yedam.inherit;

import java.util.Scanner;

// 추가/수정/삭제/목록.
// 추가: 학교친구(이름, 연락처, 학교, 전공)/ 회사친구(이름,연락처, 회사, 부서)/ 친구(이름,연락처)
// 수정: 이름조회=> 학교:학교,전공/ 회사: 회사,부서/ 친구: 연락처.
// 삭제: 이름조회=> 삭제.
// 목록: 전체목록 출력.
public class FriendExe {
	Friend[] friendArr = new Friend[10];
	int friendNum;
	// 등록시 friends[friednNum++] = new UnivFriend("학교" "전공" "이름" "번호"); 0 ~ 시작해서 배열에 들어감.
	

	public void friendAdd() {
		UnivFriend friendsh = new UnivFriend();
		CompFriend friendco = new CompFriend();
		Friend friend1 = new Friend();
		
		System.out.print("학교친구 or 회사친구 or 친구 선택>");
		String check = scr.nextLine();
		
//		String name = scr.nextLine();
//		String phone = scr.nextLine();
//		
		if (check.equals("학교친구")) {
			System.out.print("이름> ");
			friendsh.setName(scr.nextLine());
			System.out.print("연락처> ");
			friendsh.setPhone(scr.nextLine());
			System.out.print("학교> ");
			friendsh.setUniv(scr.nextLine());
			System.out.print("전공> ");
			friendsh.setMajor(scr.nextLine());

			for (int i = 0; i < friendArr.length; i++) {
				if (friendArr[i] == null) {
					friendArr[i] = friendsh;
					break;
				}
			}

		} else if (check.equals("회사친구")) {
			if (check.equals("회사친구")) {
				System.out.print("이름> ");
				friendco.setName(scr.nextLine());
				System.out.print("연락처> ");
				friendco.setPhone(scr.nextLine());
				System.out.print("회사> ");
				friendco.setCompany(scr.nextLine());
				System.out.print("부서> ");
				friendco.setDepartment(scr.nextLine());

				for (int i = 0; i < friendArr.length; i++) {
					if (friendArr[i] == null) {
						friendArr[i] = friendco;
						break;
					}
				}

			}
		} else if (check.equals("친구")) {
			if (check.equals("친구")) {
				System.out.print("이름> ");
				friend1.setName(scr.nextLine());
				System.out.print("연락처> ");
				friend1.setPhone(scr.nextLine());
				for (int i = 0; i < friendArr.length; i++) {
					if (friendArr[i] == null) {
						friendArr[i] = friend1;
						break;
					}
				}
			}
		}
	}

	public void friendChange() {
		System.out.print("학교친구 or 회사친구 or 친구 선택> ");
		String check = scr.nextLine();
		if (check.equals("학교친구")) {
			System.out.print("이름> ");
			String check1 = scr.nextLine();
			for (int i = 0; i < friendArr.length; i++) {
				if (friendArr[i] != null && friendArr[i].getName().equals(check1)) {
					System.out.print("학교> ");
					((UnivFriend)friendArr[i]).setUniv(scr.nextLine());
					System.out.print("전공> ");
					((UnivFriend)friendArr[i]).setMajor(scr.nextLine());
				}
			}
		} else if (check.equals("회사친구")) {
			System.out.print("이름> ");
			String check1 = scr.nextLine();
			for (int i = 0; i < friendArr.length; i++) {
				if (friendArr[i] != null && friendArr[i].getName().equals(check1)) {
					System.out.print("회사> ");
					((CompFriend)friendArr[i]).setCompany(scr.nextLine());
					System.out.print("부서> ");
					((CompFriend)friendArr[i]).setDepartment(scr.nextLine());
				}
			}
		} else if (check.equals("친구")) {
			System.out.print("이름> ");
			String check1 = scr.nextLine();
			for (int i = 0; i < friendArr.length; i++) {
				if (friendArr[i] != null && friendArr[i].getName().equals(check1)) {
					System.out.print("연락처> ");
					friendArr[i].setPhone(scr.nextLine());
				}
			}
		}

	}

	public void friendDelete() {
		System.out.print("이름> ");
		String check = scr.nextLine();
		for (int i = 0; i < friendArr.length; i++) {
			if (friendArr[i] != null && friendArr[i].getName().equals(check)) {
				friendArr[i] = null;
			}
		}

	}

	public void friendList() {
		for (Friend friend : friendArr) {
			if (friend != null) {
				System.out.println(friend.showInfo());
			}
		}
	}

	Scanner scr = new Scanner(System.in);

	public void execute() {
		boolean run = true;

		while (run) {

			System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 목록 | 5. 종료");
			int selectNo = Integer.parseInt(scr.nextLine());

			if (selectNo == 1) {
				friendAdd();
			} else if (selectNo == 2) {
				friendChange();
			} else if (selectNo == 3) {
				friendDelete();
			} else if (selectNo == 4) {
				friendList();
			} else if (selectNo == 5) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}

		}
	}
}
