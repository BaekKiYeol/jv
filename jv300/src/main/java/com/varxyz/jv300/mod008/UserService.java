package com.varxyz.jv300.mod008;

public class UserService{
	
	private static UserService instance = new UserService(); //싱글톤
	
	private UserService() {
		
	}
	
	public static UserService getInstance() {
		return instance;
	}
	
	public void addUser(User user) {
//		System.out.println("ID : " + user.getUserId());
//		System.out.println("PW : " + user.getPasswd());
//		System.out.println("NAME : " + user.getUserName());
//		System.out.println("SSN : " + user.getSsn());
//		System.out.println("Email : " + user.getEmail1() + user.getEmail2());
//		System.out.println("Addr : " + user.getAddr1() + user.getAddr2());
		
		System.out.println(user.getUserId().toString());
		System.out.println(user.getPasswd().toString());
		
//		user.getUserId();
	}

}
