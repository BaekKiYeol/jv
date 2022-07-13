package banking.domain;

public class CustomerServiceTest {
	public static void main(String[] args) {
		Customer c = new Customer();
//		customerService.addCustomer(null);
		CustomerServiceImpl2 c2 = new CustomerServiceImpl2();
		c.setName("홍길동");
		c.setSsn("123456-1234567");
		c.setPhone("010-0000-0000");
		c.setCustomerId("abc123");
		c.setPasswd("123456");
		
		c2.addCustomer(c);
		c2.getCustomerByssn("123456-1234567");
		c2.getAllCustomers();
		c2.getNumOfCustomers();
		
		
		System.out.println("이름 : " + c.getName());
		System.out.println("주민번호 : " + c.getSsn());
		System.out.println("전화번호 : " + c.getPhone());
		System.out.println("ID : " + c.getCustomerId());
		System.out.println("비밀번호 : " + c.getPasswd());
		
	}
}
