package com.swap.mavendemo.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility {
	static Connection connection;
	
	public static Connection getDatabaseConnection(){
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assetmanagement","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
