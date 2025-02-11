package com.shwetu.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class IPLUtility {
	
	public static Connection getConnection() {

		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ipl";
		String usr = "root";
		String pwd = "root";
		Connection conn = null;

		try {
			// load driver manager
			Class.forName(path);
			// Established connection
			conn = DriverManager.getConnection(url, usr, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}


