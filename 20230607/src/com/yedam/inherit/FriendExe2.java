package com.yedam.inherit;

import java.util.Scanner;

// 추가/수정/삭제/목록.
// 추가:학교친구(이름,연락처,학교,전공)/회사친구(이름,연락처,회사,부서)/친구(이름,연락처)
// 수정:이름조회=> 학교:학교,전공/ 회사:회사,부서/ 친구: 연락처.
// 삭제:이름조회=> 삭제.
// 목록:

public class FriendExe2 {
	// 작성.
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	int friendNum; // 초기값이 0.

	public void execute() {
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				modify();
			} else if (selectNo == 3) {
				remove();
			} else if (selectNo == 4) {
				list();
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료.");
				run = false;
			}
		}
	} // end of execute.

	// 목록.
	private void list() {
		for (Friend friend : friends) {
			if (friend != null) {
				System.out.println(friend.showInfo());
			}
		}
	} // end of list()

	// 삭제.
	public void remove() {
		System.out.println("친구이름> ");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	} // end of remove();

	// 수정.
	public void modify() {
		String info1, info2;
		System.out.println("친구이름> ");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				// 학교 or 회사 or 친구.
				if (friends[i] instanceof UnivFriend) {
					System.out.println("학교> ");
					info1 = scn.nextLine();
					System.out.println("전공> ");
					info2 = scn.nextLine();

					UnivFriend univ = (UnivFriend) friends[i];
					univ.setUniv(info1);
					univ.setMajor(info2);

					break;
				} else if (friends[i] instanceof CompFriend) {
					System.out.println("회사> ");
					info1 = scn.nextLine();
					System.out.println("부서> ");
					info2 = scn.nextLine();
//					CompFriend univ = (CompFriend) friends[i];
					((CompFriend) friends[i]).setCompany(info1);
					((CompFriend) friends[i]).setDepartment(info2);

					break;
				} else {
					System.out.println("연락처> ");
					info1 = scn.nextLine();

					friends[i].setPhone(info1);
					break;
				}
			}
		}
	} // end of modify()

	// 추가.
	public void register() {
		System.out.println("1.학교친구 2.회사친구 3.친구");
		int menu = 0;
		menu = Integer.parseInt(scn.nextLine());
		System.out.println("이름> ");
		String name = scn.nextLine();
		System.out.println("연락처> ");
		String phone = scn.nextLine();

		if (menu == 1) {
			System.out.println("학교> ");
			String univ = scn.nextLine();
			System.out.println("전공> ");
			String major = scn.nextLine();

			friends[friendNum++] = new UnivFriend(name, phone, univ, major);

		} else if (menu == 2) {
			System.out.println("회사> ");
			String company = scn.nextLine();
			System.out.println("부서> ");
			String dept = scn.nextLine();

			friends[friendNum++] = new CompFriend(name, phone, company, dept);

		} else {
			friends[friendNum++] = new Friend(name, phone);

		}
	} // end of register()

}
