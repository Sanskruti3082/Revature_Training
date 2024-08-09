package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {
	
	static Connection connection=null;
	static PreparedStatement preparedStatement=null;
	static String url="jdbc:mysql://localhost:3306/my_db";
	static String uname="root";
	static String pwd="Sanskruti@17";
public static void main(String[] args) {
	ResultSet resultSet=null;
	try {
		connection=DriverManager.getConnection(url,uname,pwd);

		/*
	    String insertSql="insert into contacts(id,name,email) values(?,?,?)";
	    preparedStatement=connection.prepareStatement(insertSql);
	    preparedStatement.setInt(1, 5);
	    preparedStatement.setString(2, "seema");
	    preparedStatement.setString(3, "seema@gmail.com");
	    
	    preparedStatement.execute();
	*/  
		
		/*
		String updateSql="update contacts set name=?, email=? where id=?";
		preparedStatement=connection.prepareStatement(updateSql);
		preparedStatement.setString(1, "sans");
		preparedStatement.setString(2, "sans@gmail.com");
		preparedStatement.setInt(3, 1);
		
		preparedStatement.execute();
		*/
		
		/*
		String deleteSql="delete from contacts where id=?";
		preparedStatement=connection.prepareStatement(deleteSql);
		preparedStatement.setInt(1, 2);
		preparedStatement.execute();
*/
		
		/*
		String sqlRead="select * from contacts";
		preparedStatement=connection.prepareStatement(sqlRead);
		//preparedStatement.setInt(1,1);
		ResultSet result=preparedStatement.executeQuery();
		
		while(result.next()) {
			System.out.println(result.getInt("id")+","+
			result.getString(2)+","+result.getString("email"));
			
			}
			*/
		
		String updateSql="update contacts set id=? where name=?";
		preparedStatement=connection.prepareStatement(updateSql);
		//preparedStatement.setInt(1,3);
		//preparedStatement.setString(2,"sonu" );
		preparedStatement.setInt(1,4);
		preparedStatement.setString(2,"seema" );
		
		
		
		
		preparedStatement.execute();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
