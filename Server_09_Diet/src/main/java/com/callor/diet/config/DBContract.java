package com.callor.diet.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContract {

	private static Connection dbConn;
	static {

		String jdbcDriver = "oracle.jdbc.OracleDriver.class";
		String url = "jdbc:oralce:thin:@localhost:1521:xe";
		String username = "myfood";
		String password = "myfood";

		// 아직 생성이 안되어 있다면
		// 이 프로젝트 어딘가에서 이미 dbConn이 만들어져 있다면 다시 만들지 않기 위한 코드
		if (dbConn == null) {

			try {
				// class.forname 자바 1.8이상에선 선택적이다. (호환성을 위해 써준다)
				Class.forName(jdbcDriver);
				dbConn = DriverManager.getConnection(url, username, password);
				System.out.println("오라클 접속 OK!!");
			} catch (ClassNotFoundException e) {
				System.out.println("ojdbc6.jar를 확인하세요.");
			} catch (SQLException e) {
				System.out.println("=".repeat(30));
				System.out.println("Driver : " + jdbcDriver);
				System.out.println("URL : " + url);
				System.out.println("username : " + username);
				System.out.println("password : " + password);
				System.out.println("-".repeat(30));
				System.out.println("오라클 DBMS 접속오류");
				System.out.println("접속 정보를 확인하세요.");
				System.out.println("=".repeat(30));
			}
		}

	}
	
	public static Connection getDBConnection() {
		return dbConn;
	}

}
