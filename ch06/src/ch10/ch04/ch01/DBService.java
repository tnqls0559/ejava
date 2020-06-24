package ch10.ch04.ch01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {
	//�ʵ� - private static
	private static DBService instance = new DBService();
	//Default������ - private
	private DBService() {}
	//�ܺο��� ���� ������ �޼ҵ� getInstance() public���� ����
	public static DBService getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection
				("jdbc:Oracle:thin:@127.0.0.1:1521:xe","scott","tiger");
		return con;
	}

}
