package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcdemo{
	public static void main(String args[]) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		int prdid,rows_affected;
		String prdname;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Kiruba289");
			System.out.println("Successfully executed");
			stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			prdid=sc.nextInt();
			System.out.println("Enter name");
			prdname=sc.next();
			
			//stmt.execute("insert into products values(1,'kumar')");
			//stmt.execute("update products set id=2 where name='kumar'");
			//stmt.execute("delete from products");
			//stmt.execute("delete from products");
			rs=stmt.executeQuery("select name from products where id="+prdid);
			rows_affected= stmt.executeUpdate("update products set name='"+prdname+"' where id="+prdid );
			System.out.println("ok");
			while(rs.next()) {
			System.out.println(rs.getString("name"));
			}
			System.out.println("successful");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally
		{
			try {
				if(stmt!=null) {
					stmt.close();
				}
				if(con!=null) {
					con.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		
				
	}

}
