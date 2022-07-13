package banking.domain;

import java.util.List;

public class Customer {
   private long cid;
   private String name; //이름
   private String ssn; //주민번호
   private String phone; //연락처
   private String customerId; //고객id
   private String passwd; //비밀번호
   private List<Account> account; //보유계좌
   
   public Customer() {
	   
   }
   
   public Customer(String name, String ssn, String phone) {
	   this.name = name;
	   this.ssn = ssn;
	   this.phone = phone;
   }
   
   public Customer(long cid) {
	  
}

public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getSsn() {
      return ssn;
   }
   public void setSsn(String ssn) {
      this.ssn = ssn;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public String getCustomerId() {
      return customerId;
   }
   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }
   public String getPasswd() {
      return passwd;
   }
   public void setPasswd(String passwd) {
      this.passwd = passwd;
   }
   public List<Account> getAccount() {
      return account;
   }
   public void setAccount(List<Account> account) {
      this.account = account;
   }
public long getCid() { 
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}

   @Override
   public String toString() {
	return "[" + cid + name + ssn + phone + customerId + passwd + "]";
   }
   
}