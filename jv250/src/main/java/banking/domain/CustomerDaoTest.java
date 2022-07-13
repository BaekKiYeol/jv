package banking.domain;

import java.util.List;

public class CustomerDaoTest {
	
	 public static void main(String[] args) {
	      CustomerDao dao = new CustomerDao();
	      
	      //findAllCustomers() Test
	      List<Customer> customerList = dao.findAllCustomers();
	      for(Customer customer : customerList) {
	         System.out.println(customer.toString());
	      }
	      
	      //find
	      Customer customer = dao.findCustomerBySsn("981212-1111111");
	      System.out.println("-------------------------------------------------");
	      System.out.println(customer);
	      System.out.println("-------------------------------------------------");
	      
	      //addCustomer for DB
	      Customer c = new Customer();
	      c.setName("공명");
	      c.setSsn("960101-1234567");
	      c.setPhone("010-5252-5252");
	      c.setCustomerId("spring");
	      c.setPasswd("2222");
	      
	      dao.addCustomer(c);
	   }
}
