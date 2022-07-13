package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6 {
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
	         
	         String sql = "SELECT * FROM Account WHERE accountNum='123-45-6789'";
	         Statement stmt = con.createStatement();         
	         ResultSet rs = stmt.executeQuery(sql); //ResultSet -> 실행해서 받아온 결과 //executeQuery -> 쿼리 실행
	         while(rs.next()) {
	            long aid = rs.getLong("aid");
	            String accountNum = rs.getString("accountNum");
	            double balance = rs.getDouble("balance");
	            double interestRate = rs.getDouble("interestRate");
	            double overdraft = rs.getDouble("overdraft");
	            String accountType = rs.getString("accountType");
	            String customerId = rs.getString("customerId");
	            System.out.println(aid);
	            System.out.println(accountNum);
	            System.out.println(balance);
	            System.out.println(interestRate);
	            System.out.println(overdraft);
	            System.out.println(accountType);
	            System.out.println(customerId);
	            System.out.println("---------------------");
	         }
	         rs.close();
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
