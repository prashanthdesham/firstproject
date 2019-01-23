package com.prismit.myinterface;

import java.sql.*;

/**
 * 
 * @author PRASHANTH
 *
 */
public class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/didb", "root", "root");
//here sonoo is database name, root is username and password  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sampletable1");
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
