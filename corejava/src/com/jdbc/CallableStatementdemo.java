package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CallableStatementdemo{
	public static void main(String args[]) {
		Connection con=null;
		CallableStatement cstmt=null;
		//Statement stmt=null;
		//ResultSet rs=null;
		//int prdid,rows_affected;
		//String prdname;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Kiruba289");
			System.out.println("Successfully executed");
			cstmt=con.prepareCall("{call getProductName(?,?)}");
			cstmt.setInt(1,2);
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			String prodname=cstmt.getString(2);
			System.out.println(prodname);
			//stmt=con.createStatement();
			//Scanner sc=new Scanner(System.in);
			//System.out.println("Enter id");
			//prdid=sc.nextInt();
			//System.out.println("Enter name");
			//prdname=sc.next();
			//stmt.execute("insert into products values(7,'raj')");
			//stmt.execute("update products set id=2 where name='kumar'");
			//stmt.execute("delete from products");
			//rs=stmt.executeQuery("select * from products ");
			//rows_affected= stmt.executeUpdate("update products set name='"+prdname+"' where id="+prdid );
			//System.out.println("ok");
			/*while(rs.next()) {
			System.out.println(rs.getString("name"));
			}
			/*System.out.println("successful");*/
			/*while(rs.next()) {
				System.out.println(rs.getInt("id"));
				}
				System.out.println("successful");*/

			
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
				if(cstmt!=null) {
					cstmt.close();
				}
				if(con!=null) {
					con.close();
				}
			}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		
				
	}

}
