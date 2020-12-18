package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdemofirstjdbc {
	public static void main(String args[]) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Kiruba289");
			System.out.println("Successfully executed");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
				
	}

}
