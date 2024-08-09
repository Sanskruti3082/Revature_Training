package com.revature.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDemo {
public static void main(String[] args) {
	Connection connection=null;
	String url="jdbc:mysql://localhost:3306/my_db";
	String uname="root";
	String pwd="Sanskruti@17";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connected..");
		
		String sql="insert into contacts values(?,?,?)";
		
		CallableStatement cs=connection.prepareCall(sql);
		
		cs.setInt(1, 5);
		cs.setString(2, "golu");
		cs.setString(3," golu@gmail.com");
		cs.execute();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
