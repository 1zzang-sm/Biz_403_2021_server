package com.callor.todo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContract {
	
	public static Connection dbConn;
	static {
		
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "!Biz12341234";
		
		try {
			Class.forName(jdbcDriver);
			if(dbConn == null) {
				dbConn = DriverManager.getConnection(url, username, password);
			}
			System.out.println("MySQL 접속 OK!!");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6.jar를 확인하세요");
		} catch (SQLException e) {
			System.out.println("=".repeat(30));
			System.out.println("jdbcDriver = " + jdbcDriver);
			System.out.println("url = " + url );
			System.out.println("username = " + username );
			System.out.println("password = " + password);
			System.out.println("-".repeat(30));
			
		}
	}

	public static Connection getDBConnection() {
		return dbConn;
	}
}
