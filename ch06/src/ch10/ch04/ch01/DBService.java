package ch10.ch04.ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {
	//필드 - private static
	private static DBService instance = new DBService();
	//Default생성자 - private
	private DBService() {}
	//외부에서 접근 가능하 메소드 getInstance() public으로 선언
	public static DBService getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection
				("jdbc:Oracle:thin:@127.0.0.1:1521:xe","scott","tiger");
		return con;
	}

}
