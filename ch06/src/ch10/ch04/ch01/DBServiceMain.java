package ch10.ch04.ch01;

import java.sql.Connection;

public class DBServiceMain {

	public static void main(String[] args) {
		//singleton ��ü ���
		DBService dbservice = DBService.getInstance();
		try {
		//db���� �α�
		Connection con = dbservice.getConnection();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
