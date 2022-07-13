package com.varxyz.jv300.mod009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	private static UserDao instance = new UserDao(); // 싱글톤
	
	public static UserDao getInstance() {
		return instance;
	}
	
	static NamingService namingService = NamingService.getInstance();
	static DataSource datasource = (DataSource)namingService.getAttribute("dataSource");
   
	public UserDao() {
		
	}
	
     public void addUser(User2 user) {
         String sql = "INSERT INTO User2(username, ssn, userId, passwd, email1)"
                  + "VALUES(?, ?, ?, ?, ?)";
         
         try {
            Connection con = null;
            PreparedStatement  pstmt = null;
            try {
               con = datasource.getConnection();
               pstmt = con.prepareStatement(sql);
               pstmt.setString(1, user.getUserName());
               pstmt.setString(2, user.getSsn());
               pstmt.setString(3, user.getUserId());
               pstmt.setString(4, user.getPasswd());
               pstmt.setString(5, user.getEmail1());
               pstmt.executeUpdate();
            } finally{
            	datasource.close(pstmt,con);
            }

            System.out.println("NEW User in User2");
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

     public List<User2> findAllUsers() {
         String sql = "SELECT * FROM User2";
         
         List<User2> userList = new ArrayList<>();
         
         try {
            Connection con = null;
            PreparedStatement  pstmt = null;
            ResultSet rs = null;
            try {
               con = datasource.getConnection();
               pstmt = con.prepareStatement(sql);
               rs = pstmt.executeQuery();
               while(rs.next()) {
            	   User2 u2 = new User2();
            	   u2.setUid(rs.getString("uid"));
            	   u2.setUserName(rs.getString("username"));
            	   u2.setUserId(rs.getString("userid"));
            	   u2.setPasswd(rs.getString("passwd"));
            	   u2.setSsn(rs.getString("ssn"));
            	   userList.add(u2);
               }
            } finally{
            	datasource.close(rs, pstmt,con);
            }

            System.out.println("NEW User in User2");
         } catch (Exception e) {
            e.printStackTrace();
         }
		return userList;
      }

	public boolean isValidUser(String userId, String passwd) {
	    String sql = "SELECT userId, passwd FROM User2 WHERE userId = ?";
        
        try {
           Connection con = null;
           PreparedStatement  pstmt = null;
           ResultSet rs = null;
           try {
              con = datasource.getConnection();
              pstmt = con.prepareStatement(sql);
              pstmt.setString(1,  userId);
              rs = pstmt.executeQuery();
              
              User2 userInfo = new User2();
              while(rs.next()) {
           	   userInfo.setUserId(rs.getString("userId"));
           	   userInfo.setPasswd(rs.getString("passwd"));
              }
              if(userId.equals(userInfo.getUserId()) && passwd.equals(userInfo.getPasswd())) {
            	  return true;
              }else {
            	  return false;
              }
           } finally{
           	datasource.close(rs, pstmt,con);
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
		return false;
	}

     
   }
