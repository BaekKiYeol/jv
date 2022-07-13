package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
	         Class.forName(driver);
	         System.out.println("LOADED DRIVER ---> " + driver);
	         
	         Connection con = DriverManager.getConnection(url, id, passwd);
	         System.out.println("CONNECTED TO ---> " + url);
	         
	         String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd) "
	                   + " VALUES(?, ?, ?, ?, ?)";
	         PreparedStatement stmt = con.prepareStatement(sql);
	         stmt.setString(1, "조조");
	         stmt.setString(2, "000101-1234567");
	         stmt.setString(3, "010-7777-7777");
	         stmt.setString(4, "qwer");
	         stmt.setString(5, "a123456789");
	         stmt.executeUpdate(); //ResultSet -> 실행해서 받아온 결과 //executeQuery -> 쿼리 실행
	         
	         System.out.println("INSERTD.....");
	         stmt.close();
	         con.close();
	         
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	      }
	      finally {
	         
	      }
	}
}
