package com.yedam.abstracts;

// mysql : dbms 기능구현. 추가: add()
// oracle : dbms 기능구현. 추가: plus()

public class JdbvExe {
	public static void main(String[] args) {
		Dao dao = new OracleDao(); //new MysqlDao();
		//OracleDao odao = new OracleDao(); // 상속의 관계가 아닐 경우 안됨.
		
		dao.start(); // odao.begin(); 새로 정의하고 기존 코드 변경. 일이 많아짐.
		dao.add(); // odao.register();
		dao.modify(); // odao.modify();
		dao.remove(); // odao.delete();
		dao.stop(); // odao.end();
	}
}
