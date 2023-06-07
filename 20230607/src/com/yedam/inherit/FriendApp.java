package com.yedam.inherit;

//친구의 정보를 저장. 이름/연락처/ = friend.
//학교친구 - 이름/연락처/학교이름/전공 = UnivFriend
// 회사친구 - 이름/연락서/회사명/부서 = CompFriend

public class FriendApp extends Friend {
	public static void main(String[] args) {
		FriendExe2 exe = new FriendExe2();
		exe.execute(); // 실행시작 메소드.
	}

	public static void method() {
		Friend[] friends = new Friend[10];
//		UnivFriend[] univs = new UnivFriend[10];

		friends[0] = new Friend("홍길동", "010-1111");
		friends[1] = new UnivFriend("김민기", "010-2222", "대구대", "역사");
		friends[2] = new CompFriend("박호섭", "010-3333", "네이버", "개발부서");

		for (Friend friend : friends) {
			if (friend != null) {
				System.out.println(friend.showInfo());
			}
		}
	}
}
