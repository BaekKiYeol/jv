package banking.domain;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class CustomerServiceImpl implements CustomerService {
	private static CustomerService service = new CustomerServiceImpl();
   private Map<String, Customer> map = new HashMap<>();
   
   private CustomerServiceImpl() {
	  super(); 
   }
   
   public static CustomerService getInstance() {
	   return service;
   }
   
   public void addCustomer(Customer customer) {
    if(!map.containsKey(customer.getSsn())) {
    map.put(customer.getSsn(), customer);
    }
   }


   
   //주민번호를 받아와서 그 주민번호의 회원을 호출해주는 메소드
   public Customer getCustomerByssn(String ssn) {
      if(map.containsKey(ssn)) {
         return map.get(ssn);
      }
      return null;
   }


   //모든 회원정보를 불러오는 메소드
   public Collection<Customer> getAllCustomers() {
      return map.values();
   }


   //모든 회원 수를 알려주는 메소드
   public int getNumOfCustomers() {
      return map.size();
   }

}