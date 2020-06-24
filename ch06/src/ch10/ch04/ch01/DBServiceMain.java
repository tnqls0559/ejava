package ch10.ch04.ch01;

import java.sql.Connection;

public class DBServiceMain {

	public static void main(String[] args) {
		//singleton °´Ã¼ ¾ò±â
		DBService dbservice = DBService.getInstance();
		try {
		//db¿¬°á ¸Î±â
		Connection con = dbservice.getConnection();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
