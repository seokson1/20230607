package com.yedam.emp;

import java.util.ArrayList;

class Member{
	private String memberId;
	private String memberName;
	private int score;
	
	Member(String memberId, String memberName, int score) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

// 배열 > 컬렉션.
// 추상클래스 : 추상메소드. (추가, 수정, 삭제)
public class ArrayExe {
	public static void main(String[] args) {
		
		ArrayList members = new ArrayList<>();
		members.add(new Member("001", "홍길동", 100));
		members.add(new Member("002", "김길동", 200));
		
		for(int i =0; i<members.size(); i++) {
			Member member = (Member)members.get(i);
			if(member.getMemberName().equals("홍길동")) {
			//	members.remove(i);
				members.set(i, new Member("010", "김민식", 150));
			}
		}
		
		
		ArrayList arry = new ArrayList<>();
		arry.add("홍길동"); // 0
		arry.add("김기동"); // 1 -> 지워지면 지워진 위치에 값을 옮겨줌. ex) 박길동 index 2를 가짐.
		// arry.add(new Integer(100));
		arry.add("박길동"); // 2 사이즈는 크기가 넣은 만큼 변함. 가변적임. 따로 지정할 필요없음.
		
		
		arry.set(0, "황길동"); // 수정 set 몇 번째 위치에 내용 변경할 지. (index , 변경내용)
		
		arry.remove(1); // 삭제시 인데스 remove(index);
		
		for(int i=0; i<arry.size(); i++) {
			System.out.println(arry.get(i)); //get 값을 가져올때.
		}
//		for (Object name : arry) {
//			System.out.println((String) name);
//		}
	}
}
