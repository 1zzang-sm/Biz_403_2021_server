package com.callor.maven.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDBConnection {

	private static Connection dbConn;

	static {

		String jdbcDriver = "";
		String url = "";
		String username = "";
		String password = "";

		try {
			Class.forName(jdbcDriver);
			if (dbConn == null) {
				dbConn = DriverManager.getConnection(url, username, password);
			}
			System.out.println("오라클 접속 OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar를 확인하세요.");
		} catch (SQLException e) {
			System.out.println("=".repeat(30));
			System.out.println("Driver : " + jdbcDriver);
			System.out.println("url : " + url);
			System.out.println("username : " + username);
			System.out.println("password : " + password);
			System.out.println("-".repeat(30));
			System.out.println("MySQL 접속오류");
			System.out.println("=".repeat(30));
		}
	}
	
	public static Connection getDBConnection() {
		return dbConn;
	}

}
