package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
public class JDBCStatementInsert {
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		String url="jdbc:mysql://localhost:3306/my_db";
		String uname="root";
		String pwd="Sanskruti@17";
		//STEP1--> LOAD THE DRIVER
		
		try {
			//Class.forName("com.mysql.cj.jdb.Driver");
			
			//STEP2--> CREATE THE CONNECTION OBJECT
			connection=DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected..");
			
			//STEP3--> cREATE STATEMENT/PS/CS OBJECT
			statement = connection.createStatement();
			String sql1="insert into contacts ()";
			
			
			//STEP4--> EXECUTE QUERY AND GET RESULTSET
			resultSet=statement.executeQuery(sql1);
			
			//STEP 5--> PROCESS THE RESULT SET
			
			while(resultSet.next()) {
			System.out.println(resultSet.getInt("id")+","+
			resultSet.getString(2)+","+resultSet.getString("email"));
			
			}	
			//STEP6--> CLOSE THE CONNECTION
			connection.close();
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
}
